### 基于Spring Boot结合Flowable一系列生态的简单框架，用于探索未知的问题

#### 关于部署方式

##### XML

可以通过定义好的xml，通过读取xml文件的方式，实现部署，正如官网中的例子写道

```Java
RepositoryService repositoryService = processEngine.getRepositoryService();
Deployment deployment = repositoryService.createDeployment()
  .addClasspathResource("holiday-request.bpmn20.xml")
  .deploy();
```

通过调用`processEngine.getRepositoryService()`方式获取`RepositoryService`.

在Spring Boot 中的，由于Flowable一些生态Bean都集成在了org.flowable.engine中，通过自动注入(@Autowired)的方式即可获取到相应的服务实例，

##### bpmnModel

相比xml形式，bpmnModel可以任意读取数据进行相应模型部署，可以定制化的操作空间更大。唯一的缺点是工作量有点大。

定义好bpmnModel之后，可以用`org.flowable.Validator`集成的`Validator`进行检验，来检验相关标签的合法性。

具体而言，bpmnModel等同于定义好各个部分，比如`Gateway`, `UserTask`, `ServiceTask`, etc. 然后利用SequenceFlow将各个部分串接起来，行程一个审批流程。

但是基本缺点也是比较明显(也可能是因为调研不够)，`ServiceTask`提供的一些api不够，比如xml中的delegation属性，在bpmnModel好像就无法实现，因此bpmnModel还是有一定的局限性。





