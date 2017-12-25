# Android-Design-Patterns

基于Java24种设计模式，在Android开发中的使用进行一一举例及实践，每种设计模式对应一个demo进行说明和讲解。

## 1.观察者设计模式

### 1.1 定义

	定义对象间的一种一对多的依赖关系，使得每当一个对象改变状态时，则所有依赖于它的对象都会得到通知并被自动更新。

### 1.2 为了解决什么问题

	观察者模式是为了解决一对多的问题，例如我们现实生活中：收听广播，订阅报纸及书刊等等。

### 1.3 UML图

![image](https://github.com/xinpengfei520/Android-Design-Patterns/blob/master/images/observer1.png)

### 1.4 优点

 - 观察者和被观察者之间是抽象耦合
   如此设计，则不管是增加观察者和被观察者都是非常容易扩展的，而且在Java中已经实现了抽象层级的定义，在系统方面更是得心应手，使用时只需要具体实现即可。
 - 建立一套触发机制
   根据单一职责原则，每个类的职责是单一的，那怎么把各个职责单一的类串联成真实世界中复杂的逻辑关系呢？其实这就是一个触发机制，观察者模式可以完美的实现链条式触发响应事件。、

### 1.5 缺点

 - 观察者模式需要考虑一下开发效率和运行效率的问题
  一个观察者和多个被观察者，开发和调试就会比   较复杂，而且在Java中消息的通知默认是按顺序执行，一个观察者卡壳，会影响后面的执行效率，在这 种情况下一般考虑采用异步方式实现。
 - 多级触发时的效率更让人担忧，在设计时注意考虑！

### 1.6扩展

Java内置的接口已经抽象实现了 **Observer** 和 **Observable** ,这样我们可以很方便、简单的实现观察者和被观察之间的关系了。
	
## 2.组合模式

### 2.1定义

组合模式也叫作部分-整体模式，主要来描述部分与整体的关系。官方定义：将对象组合成树形结构以表示部分-整体的层次结构，使得用户对单个对象和组合对象的使用具有一致性。组合模式的要点在于：提取共同点作为基类，把不同点作为子类。

### 2.2组合模式的几个角色

 - Component : 是组合中的所有对象的统一接口；定义了特定情况下，类应当实现的货缺省的行为
 - Component 声明一个接口用于访问和管理 Component 的子组件；在递归结构中定义一个接口，用于访问一个父部件，并符合条件的类中实现它，当然这个是可选的。
 - Leaf：在组合中表示叶节点对象，顾名思义，叶节点没有子节点。
Composite：定义有子部件的那些部件的行为，同时存储子部件，实现 Component 中与子部件有关的接口。
 - Client：通过Component接口，操纵组合部件的对象。

### 2.3协作原理

用户使用Component类接口与组合结构中的对象进行交互。 如果接收者是一个叶节点，则直接处理请求。 如果接收者是Composite， 它通常将请求发送给它的子部件， 在转发请求之前与/或之后可能执行一些辅助操作。

### 2.4UML图

![image](https://github.com/xinpengfei520/Android-Design-Patterns/blob/master/images/combine.png)

### 2.5组合模式的扩展

透明的组合模式、安全的组合模式
为了解决问题：比如组织结构这棵树，我从中抽取一个用户，要找到它的上级有哪些，下级有哪些，怎么处理？ 
解决方案：在基类中增加两个方法：setParent是设置父节点是谁，getParent是查找父节点是谁。
组合模式体现了：开闭原则，里氏替换原则，依赖倒置原则 
因为使用了抽象类——开闭原则 
因为使用了抽象类——里氏替换原则 
因为使用了抽象类和继承——依赖倒置原则

### 2.6优点

 - 高层模块调用简单
   一颗树形结构中的所有节点都是Component,局部和整体对调用来说没有任何区别，也就是说，高层模块不必关心自己处理的是单个对象还是整个组合结构，简化了高层模块的代码。
 - 节点自由增加
   使用了组合模式后，我们可以看看，如果想增加一个树枝节点、树叶节点是不是都很容易，只要找到它的父节点就成，非常容易扩展，符合开闭原则，对以后的维护非常有利。

### 2.7缺点

组合模式有一个非常明显的缺点，看到我们在场景类中的定义，提到树叶和树枝使用时的定义了吗？直接使用了实现类！这在面向接口编程上是很不恰当的，与依赖倒置原则冲突，所以我们在使用的时候要考虑清楚，它限制了你接口的影响范围。

### 2.8案例

	1.杀毒软件。遍历每个文件，为不同类型的文件格式提供不同的杀毒方式。
	2.View及ViewGroup的设计。

