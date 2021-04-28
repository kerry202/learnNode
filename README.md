﻿<div align="center">
    <img src="asset/topbanner.png"/>
</div>

<div align="center">
    <a href="#"><img src="https://img.shields.io/badge/面向-笔记-yellowgreen.svg"/></a>
    <a href="#"><img src="https://img.shields.io/badge/star-1-reen.svg"/></a>
    <a href="#"><img src="https://img.shields.io/badge/状态-正在更新中...-red.svg"/></a>
</div>
<br>

| Android | Java |算法 | C/C++/Linux/Dart | Python | 计算机网络 | 计算机组成原理 | 数据结构 | 操作系统 | 密码学 | 设计模式 | 其他 |
| :-----------------------------:      | :----: | :----: | :-----: | :------: | :----------: | :--------------: | :--------: | :--------: | :------: | :--------: | :----: |
| [:hot_pepper:](#hot_pepper-Android)  | [:eagle:](#eagle-Java) | [:aerial_tramway:](#aerial_tramway-算法) | [:yin_yang:](#yin_yang-C/C++/Linux/Dart) | [:zap:](#zap-Python) | [:apple:](#apple-计算机网络) | [:bamboo:](#bamboo-计算机组成原理) | [:fallen_leaf:](#fallen_leaf-操作系统) | [:fountain_pen:](#fountain_pen-操作系统) | [:balloon:](#balloon-密码学) | [:gift_heart:](#gift_heart-设计模式) | [:beach_umbrella:](#beach_umbrella-其他) |

<br>

作为开发者，基础知识非常重要的，尤其一些大厂非常注重基础，基础是一切的根本，在面试时候，如果没有事先准备，很容易被淘汰。笔者整理这套知识点，大大小小的一共几百多条，方便大家查漏补缺，本仓库持续更新中，有些链接404，笔者还没录入， 总览请[点击这里](其他/知识点总结.md)。

### :hot_pepper: Android

* [Android基础](Android/Android基础.md)
* Framework

  * [View 体系](Android/View体系.md)
  * [Android系统架构](Android/Android系统架构.md)
  * [Android系统启动](Android/Android系统启动.md)
  * [应用进程启动过程](Android/应用程序进程启动过程.md)
  * [Activity启动过程](Android/Activity启动过程.md)
  * [Service启动过程](Android/Service启动过程.md)
  * [广播启动过程](Android/广播启动过程.md)
  * [ContentProvider启动过程](Android/ContentProvider启动过程.md)
  * [Context](Android/Context.md)
  * [AMS](Android/ActivityManagerService.md)
  * [WMS](Android/WindowManagerService.md)
  * [LayoutInfater](Android/LayoutInflater.md)
  * [Binder](Android/Binder.md)
  * [DataBinding](Android/DataBinding原理.md)
* Android 进阶
  
  * [Handler解析](Android/Handler.md)
  * [函数式编程](Android/函数式编程.md)
  * [IntentService](Android/IntentService.md)
  * [MVC、MVP、MVVM](Android/MVC、MVP、MVVM.md)
  * [HandlerThread](Android/HandlerThread.md)
  * [Apk 打包](Android/Apk打包流程.md)
  * [Dalvik和ART](Android/Dalvik和ART.md)
  * [Hook 技术](Android/Hook技术.md)
  * [v1、v2、v3 签名区别](Android/v1、v2、v3签名区别.md)
  * [RecyclerView](RecyclerView,md)
  * [ViewPage2](Android/ViewPage2.md)
  * [View绘制流程](Android/View绘制流程.md)
  * [事件分发](Android/事件分发.md)
  * [换肤](Android/换肤方案.md)
  * [热修复](Android/热修复.md)
  * [插件化](Android/插件化)
  * [组件化](Android/组件化.md)
  * [Jetpack](Android/Jetpack.md)
  * [JNI](NDK/JNI.md)
  * [MMKV](Android/MMKV.md)
  * [Bitmap](Android/Bitmap.md)
  * [Android9.0非SDK接口限制](Android/Android9.0非SDK接口限制.md)
  * [保活](Android/保活.md)
* 源码分析
  * [ARouter](Android/第三方源码/Arouter.md)
  * [ButterKnife](Android/第三方源码/ButterKnife.md)
  * [Dagger2](Android/第三方源码/Dagger2.md)
  * [EventBus](Android/第三方源码/EventBus.md)
  * [Glide](Android/第三方源码/Glide.md)
  * [GreenDao](Android/第三方源码/GreenDao.md)
  * [Leakcanary](Android/第三方源码/Leakcanary.md)
  * [Okhttp](Android/第三方源码/Okhttp.md) 
  * [Retrofit](Android/第三方源码/Retrofit.md)
  * [RxJava](Android/第三方源码/RxJava.md)
* 性能优化
  * 稳定性优化
  * 内存优化
  * [绘制优化](Android/性能优化/绘制优化.md)
  * [电量优化](Android/电量优化.md)
  * 启动优化
  * [网络优化](Android/网络优化.md)
  * 包体积优化
* 其他知识点
  * [HTTP和HTTPS](其他/HTTP和HTTPS.md)
  * [HTTP1.0、HTTP2.0、HTTP3.0](其他/001.HTTP1.0、HTTP2.0、HTTP3.0.md)
  * [红黑树](其他/红黑树.md)

### :eagle: Java

* [Java基础](Java/Java基础.md)
  * [泛型](Java/泛型.md)
  * [反射与动态代理](Java/反射与动态代理.md)
  * [异常体系](Java/异常体系.md)
* [JavaIO](Java/JavaIO.md)
* [Java容器](Java/Java容器.md)
  * [ConcurrentHashMap解析](Java/ConcurrentHashMap.md)
  * [HashMap解析](Java/HashMap.md)
  * [CopyOnWriteArrayList解析](Java/CopyOnWriteArrayList.md)
  * [ArrayList解析](Java/ArrayList源码分析.md)
  * [LinkedList解析](Java/LinkedList源码分析.md)
  * [PriorityQueue解析](Java/PriorityQueue源码分析.md)
  * [LinkedHashMap解析](Java/LinkedHashMap源码分析.md)
* [Java并发](Java/Java并发.md)
* [Java线程池](Java/Java线程池.md)
* [Java虚拟机](Java/Java虚拟机.md)

### :aerial_tramway: 算法

* [算法训练营](算法/算法训练营.md)
* [剑指Offer](算法/剑指Offer.md)
* [Leetcode](算法/leetcode.md)
* [TOP100](算法/top100.md)
* [推荐网站]()
* [排序算法](算法/排序.md)

### :yin_yang: C/C++/Linux/Dart
* [C基础](C/C基础.md)
* [C++基础](C++/C++基础.md)
* [Linux基础](C/Linux基础.md)
* [Dart基础](Flutter/Dart/Dart语言.md)

### :zap: Python
* [Python基础](Python/Python基础.md)
* [爬虫例子](Python/一个图片爬虫例子.md)
* [bilibili视频爬虫](Python/bili视频爬虫.md)

### :apple: 计算机网络
* [计算机网络概述](计算机网络/001.计算机网络概述.md)
* [物理层](计算机网络/002.物理层.md)
* [数据链路层](计算机网络/003.数据链路层.md)
* [网络层](计算机网络/004.网络层.md)
* [传输层](计算机网络/005.传输层.md)
* [应用层](计算机网络/006.应用层.md)

### :bamboo: 计算机组成原理
* [计算机系统概述](计算机组成原理/001.计算机系统概述.md)
* [数据的表示和运算](计算机组成原理/002.数据的表示和运算.md)
* [存储系统](计算机组成原理/003.存储系统.md)
* [指令系统](计算机组成原理/004.指令系统.md)
* [中央处理器](计算机组成原理/005.中央处理器.md)
* [总线](计算机组成原理/006.总线.md)
* [IO系统](计算机组成原理/007.IO系统.md)

### :fallen_leaf: ​数据结构
* [绪论](数据结构/001.绪论.md)
* [线性表](数据结构/002.线性表.md)
* [栈和队列](数据结构/003.栈和队列.md)
* [串](数据结构/004.串.md)
* [树与二叉树](数据结构/005.树与二叉树.md)
* [图](数据结构/006.图.md)
* [查找](数据结构/007.查找.md)
* [排序](数据结构/008.排序.md)

### :fountain_pen: 操作系统
* [计算机系统概述](操作系统/001.计算机系统概述.md)
* [进程管理](操作系统/002.进程管理.md)
* [内存管理](操作系统/003.内存管理.md)
* [文件管理](操作系统/004.文件管理.md)
* [输入输出（IO）管理](操作系统/005.输入输出（IO）管理.md)

### :balloon: 密码学

* [密码学概述](密码学/001.密码学概述.md)
* [凯撒密码](密码学/002.凯撒密码.md)
* [对称加密](密码学/003.对称加密.md)
* [消息摘要](密码学/004.消息摘要.md)
* [非对称加密](密码学/005.非对称加密.md)
* [数字签名](密码学/006.数字签名.md)

###  :gift_heart: 设计模式
* [设计模式七大原则](设计模式/001.设计模式七大原则.md)
* [设计模式简介](设计模式/002.设计模式简介.md)
* [UML](设计模式/003.UML.md)
* 创建者模式
  * [单例模式](设计模式/004.创建者模式_单例模式.md)
  * [工厂模式](设计模式/005.创建者模式_工厂模式.md)
  * [原型模式](设计模式/006.创建者模式_原型模式.md)
  * [建造者模式](设计模式/007.创建者模式_建造者模式.md)
* 结构型模式  
  * [适配器模式](设计模式/008.结构型模式_适配器模式.md)
  * [代理模式](设计模式/009.结构型模式_代理模式.md)
  * [装饰者模式](设计模式/010.结构型模式_装饰者模式.md)
  * [桥接模式](设计模式/011.结构型模式_桥接模式.md)
  * [外观模式](设计模式/012.结构型模式_外观模式.md)
  * [享元模式](设计模式/013.结构型模式_享元模式.md)
  * [组合模式](设计模式/014.结构型模式_组合模式.md)
  * [桥接模式](设计模式/015.结构型模式_桥接模式.md)
* 行为型模式  
  * [模板模式](设计模式/016.行为型模式_模板模式.md)
  * [策略模式](设计模式/017.行为型模式_策略模式.md)
  * [命令模式](设计模式/018.行为型模式_命令模式.md)
  * [职责链模式](设计模式/019.行为型模式_职责链模式.md)
  * [状态模式](设计模式/020.行为型模式_状态模式.md)
  * [观察者模式](设计模式/021.行为型模式_观察者模式.md)
  * [中介者模式](设计模式/022.行为型模式_中介者模式.md)
  * [迭代器模式](设计模式/023.行为型模式_迭代器模式.md)
  * [访问者模式](设计模式/024.行为型模式_访问者模式.md)
  * [备忘录模式](设计模式/025.行为型模式_备忘录模式.md)
  * [解释器模式](设计模式/026.行为型模式_解释器模式.md)
* [模式对比](设计模式/027.模式对比.md)

### :beach_umbrella: 其他

* [正则](正则/正则表达式.md)
* [git]()
  * [git基础1](Git/part01/000.目录.md) 
  * [git基础2](Git/part01/000.目录.md)
  * [reset和checkout区别](Git/001.reset和checkout区别.md)  