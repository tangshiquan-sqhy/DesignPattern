此为学习设计模式所写的代码及一些心得体会。
单例模式：
    此单例写法为双重检查锁(double-checked locking)方式。
    instance = new Sington();在底层分为3步执行：1）开辟内存空间；2）调用初始化方法；3）给instance变量赋引用。
    由于在代码编译、内存加载、CPU执行等阶段都会因为优化而进行指令重排。所以第二步和第三步可能会交换执行。
    这种情况下，其它线程在if (instance == null) 判断时，会发现instance变量已经有引用值，则会返回引用值。
    然而，调用者却发现此引用对应的对象还是个空对象，无法使用（因为获取锁的线程还没有调初始化方法），程序便会报异常。
    而加了volatile之后，禁止指令重排，保证了第二步和第三步按顺序执行。
建造者模式：
    建造者模式是对调用者屏蔽对象创建的过程，只给调用者返回最终创建完成后的对象。
    框架源码、工具类中随处可见的以Builder结尾的类便是建造者模式的应用。
装饰器模式：
    装饰器模式是在不改变原有组件功能的基础上，拓展其功能的设计模式。可以通过不同组合实现不同的功能效果。符合开闭原则。
    典型应用：Mybatis中Executor接口下的CachingExecutor类。它是在其它Executor类的基础上，拓展出缓存功能。
门面模式：
    门面模式是对调用底层服务的过程进行一个封装整合。
    如果没有门面，调用者还需要知道底层服务各个接口的功能和调用依赖关系非常清楚。如果需要修改调用流程，调用者还需要改代码。
    有了门面，不论底层服务增加或修改接口、调用流程修改等情况，只需要修改门面即可。对调用者完全透明。
    典型的应用：1）业务代码中controller调多个service这种模式便是。2）Tomcat中RequestFacade类便是Request类的门面。
享元模式：
    应用共享技术，有效地支持大量细粒度对象的使用
    经典应用场景：Java  String、Long、Integer等类
观察者模式：
    多个观察者同时监听一个主题对象，当主题对象发生变化时，能通知到所有观察者，使其能根据主题对象变更来做一些操作。
    经典应用场景：Spring中的ApplicationListener
策略模式：
    定义了算法族，可根据情况替换随时算法，使其独立于使用者。
    经典应用场景：Java Thread类、Arrays.sort()方法
模板方法模式：
    定义一个算法的步骤骨架，公共的部分在抽象类中实现，具体的业务留给子类实现。
    经典应用：Spring整合SpringMVC注解版配置原理
    AbstractAnnotationConfigDispatcherServletInitializer -> AbstractDispatcherServletInitializer -> AbstractContextLoaderInitializer ---> WebApplicationInitializer


