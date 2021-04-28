
## 1 ����
ʵ����Ŀ�У�ʹ�� DataBinding ����

```java
class ConversationViewModel(application: Application) : BaseInjectViewModel<IMModel>(application) {
    var name = ObservableField<String>()
}
```

activity_conversation.xml

```xml
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto">

    <data>

        <variable
            name="viewModel"
            type="com.zp.im.ui.msg.ConversationViewModel"/>
    </data>
    <RelativeLayout>
      <TextView
         android:id="@+id/tv_name"
         android:text="@{viewModel.name}"/>
    </RelativeLayout>

</layout>

```

## 2 ԭ��

AS ������ XXXImpl.java ����
```java
public class ActivityConversationBindingImpl extends ActivityConversationBinding  {
    ...
    public ActivityConversationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    } 
    //mapBindings ��������� bindings ����ǿתΪ���ǵĿؼ�����
    
    private ActivityConversationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[5]
            , (com.zpparts.res.widget.MarqueeTextView) bindings[1]
            , (android.widget.TextView) bindings[4]
            );
        //����tag�ҵ��ؼ�
        this.ivOnline.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (com.zpparts.res.widget.MarqueeTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.tvName.setTag(null);
        this.tvShop.setTag(null);
        setRootTag(root);
        // ����������� requestRebind -> ͨ�� handler ��ʽ���� ui
        // mUIThreadHandler.post(mRebindRunnable);
        // mRebindRunnable -> executeBindings()
        invalidateAll();
    }
    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            //setViewModel
            setViewModel((com.zp.im.ui.msg.ConversationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.zp.im.ui.msg.ConversationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    
    @Override
    protected void executeBindings() {
        ...
        androidx.databinding.ObservableField<java.lang.String> viewModelName = null;
        ...

        if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.name
                        viewModelName = viewModel.getName();
                    }
                    //ע��۲��ߣ��������󶨵����ݣ�ͨ���۲���ģʽ�����Ӱ󶨵����ݣ�����һ���仯���ͻ����
                    updateRegistration(4, viewModelName);

                    if (viewModelName != null) {
                        // read viewModel.name.get()
                        viewModelNameGet = viewModelName.get();
                    }
            } 
       
        //���������޸�UI
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1
            //this.tvName ���ǲ�����id Ϊ tv_name �� TextView 
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewModelNameGet);
        }

    }

}

```
* ͨ������ XXXbinding �� setVariable() ���� setViewModel()����������ʵ�����������ViewModel�������ˡ�
* executeBindings() ע��۲��ߣ��������󶨵����ݣ�ͨ���۲���ģʽ�����Ӱ󶨵����ݣ�����һ���仯���ͻ���� UI

## 3 �ܽ�

* dataBinding ֻ��һ�ֹ��ߣ��� MVVM(���˼��)����ȫû�й�ϵ�ģ�MVC��MVPͬ������ʹ��dataBinding��
* ʹ�� DataBinding �ᵼ�´������ڴ����ġ�
  * �������������飬��� view ����
  * ���ڴ��� handler��looper ���ϵ�ѭ����Ϣ
  * ���ÿһ���ؼ��������һ���ص�����

* dataBinding ʹ�� APT �����������ڼ����ɿؼ��� model �İ󶨴��롣���Ի�����ܶ��࣬���Ų����ļ������ӣ������Խ��Խ����