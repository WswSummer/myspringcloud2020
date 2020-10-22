## SpringCloud2020学习笔记

## SpringCloud

### 1. 架构

![Spring Cloud diagram](https://spring.io/images/cloud-diagram-1a4cad7294b4452864b5ff57175dd983.svg)

![E16B8C77-DF36-4e05-B499-AB210B5FE4E8](https://user-images.githubusercontent.com/34562805/95718420-0189ad00-0ca1-11eb-8ae5-0be7b868a1a3.png)

### 2. 技术栈

![5193C25A-B86F-4576-B85E-6655298492DF](https://user-images.githubusercontent.com/34562805/95718543-3138b500-0ca1-11eb-933a-cbfb2851f12c.png)

![50E60A17-11AA-49f8-8882-94A2FCE3E2B3](https://user-images.githubusercontent.com/34562805/95718668-575e5500-0ca1-11eb-921f-13b76f82f2fa.png)

**=> 升级**

![80D283E7-0DBF-48f1-98CA-8193250E663B](https://user-images.githubusercontent.com/34562805/95718767-7ceb5e80-0ca1-11eb-9dce-02ef8d716fff.png)

``````xml
<spring.boot.version>2.2.2.RELEASE</spring.boot.version>
<spring.cloud.version>Hoxton.SR1</spring.cloud.version>
<spring.cloud.alibaba.version>2.1.0.RELEASE</spring.cloud.alibaba.version>
``````

https://github.com/OT-mt/cloud2020

***

注册中心

### 3. Eureka

#### 3.1 单机

![B99832CE-A704-4df5-9155-9B2E165A23DD](https://user-images.githubusercontent.com/34562805/95720635-14ea4780-0ca4-11eb-9c13-aed9a0c03204.png)

![9D6C188C-643A-4d95-ABA1-E01545F71A2E](https://user-images.githubusercontent.com/34562805/95720685-229fcd00-0ca4-11eb-8a52-d58a2e53f535.png)

![12859036-EA80-466b-B75A-533ACF603ECC](https://user-images.githubusercontent.com/34562805/95720718-2f242580-0ca4-11eb-97f6-969c8cb92acc.png)

#### 3.2 集群

![38140675-FCA7-4734-90D6-319060D9EC03](https://user-images.githubusercontent.com/34562805/95729125-fccbf580-0cae-11eb-9ace-ef3093f35c21.png)

![819D2832-4034-4020-BE99-F0F018F26127](https://user-images.githubusercontent.com/34562805/95729205-1ff6a500-0caf-11eb-856e-ba4d212024e5.png)

![1EFC138A-43E4-4465-95A2-E7A99781AE74](https://user-images.githubusercontent.com/34562805/95730014-46691000-0cb0-11eb-97b3-8665d138fdd9.png)

### 4. Zookeeper

### 5. Consul

![309BC44E-89EE-44a6-88DB-3C03D0936E33](https://user-images.githubusercontent.com/34562805/95822484-98686f00-0d5e-11eb-9417-0a556c155a0e.png)

![662A3EDD-4599-4231-A99B-8EF2AE7DE786](https://user-images.githubusercontent.com/34562805/95822533-b0d88980-0d5e-11eb-9457-9c271f2ceb91.png)

![38FADBC0-7B30-4f1c-BD31-7399D39EFB46](https://user-images.githubusercontent.com/34562805/95822560-bcc44b80-0d5e-11eb-9d2f-ea74b30cd395.png)



***

负载均衡、服务调用

### 7. Ribbon

![E8670868-D290-4896-A07E-F1E8C2F4F396](https://user-images.githubusercontent.com/34562805/95822591-cbaafe00-0d5e-11eb-8802-dcb4862b2d70.png)

![B77B8E1D-575A-40fc-8278-5CB24DA0A632](https://user-images.githubusercontent.com/34562805/95828852-0e250880-0d68-11eb-9453-420307ed2944.png)

![B77B8E1D-575A-40fc-8278-5CB24DA0A636](https://user-images.githubusercontent.com/34562805/95828901-2137d880-0d68-11eb-83d9-cc399e50f530.png)

![62E97409-719D-4b66-B8CA-44DC5E2E45DD](https://user-images.githubusercontent.com/34562805/95829040-4f1d1d00-0d68-11eb-8dd8-82af8cc7a034.png)

自己实现轮询算法：CAS+自旋锁

### 8. OpenFeign

![38273E6A-88D4-4b84-B683-54E2D9FDAE17](https://user-images.githubusercontent.com/34562805/95841017-74655780-0d77-11eb-953f-b442310361e1.png)

![38273E6A-88D4-4b84-B683-54E2D9FDAE68](https://user-images.githubusercontent.com/34562805/95841060-81824680-0d77-11eb-923a-422eae4825e4.png)

***

服务降级 服务熔断 服务限流

### 9. Hystrix断路器

![36C55B01-BAC3-4449-BFAF-38C7D7C8AACA](https://user-images.githubusercontent.com/34562805/95948141-9536b700-0e22-11eb-8dc7-cc81893ffbcd.png)

![18E55CA2-A06B-42ee-B6D5-58E70B8AF81F](https://user-images.githubusercontent.com/34562805/95948176-a8e21d80-0e22-11eb-9f47-c94d0bac2765.png)

![AFF5775A-C6E0-4d08-8DDD-72E581BFB113](https://user-images.githubusercontent.com/34562805/95948214-ba2b2a00-0e22-11eb-941c-228be5c52ac1.png)

![46E5C318-20E0-4485-AE45-D95E54A80F43](https://user-images.githubusercontent.com/34562805/95948234-c3b49200-0e22-11eb-829c-7ff9ffd02962.png)

![D7622DC2-5FF4-4a26-A493-93E4525B64BD](https://user-images.githubusercontent.com/34562805/95948263-d038ea80-0e22-11eb-8cd6-8a03e925dc4f.png)

![258A734B-9819-43d7-BAB9-5FFDE27EEE58](https://user-images.githubusercontent.com/34562805/95948293-e0e96080-0e22-11eb-9bd3-0721c2c7363f.png)

![3796B15C-9895-464d-9135-400FB4B8E6F4](https://user-images.githubusercontent.com/34562805/95948315-eb0b5f00-0e22-11eb-80a1-b1fd2cba1349.png)

![A8844D67-D87A-40ef-BCEB-7FE61D4534F7](https://user-images.githubusercontent.com/34562805/95972493-18690480-0e45-11eb-8870-0833a87baf1e.png)

![639E0D7C-DF2E-4ae8-BB6A-3AEA2B49F42D](https://user-images.githubusercontent.com/34562805/96084253-5b80b180-0ef1-11eb-9789-fe583bb0de72.png)

![F30A926E-0B5A-4a54-A00F-8F7B1F6F683E](https://user-images.githubusercontent.com/34562805/96084316-77845300-0ef1-11eb-9de7-dae83032a4a4.png)

***

服务网关

### 10. Gateway

![073EDE4E-C2D7-475d-8102-7C390B4A878E](https://user-images.githubusercontent.com/34562805/96206785-3f861a00-0f9c-11eb-9808-e00382482095.png)

![639E0D7C-DF2E-4ae8-BB6A-3AEA2B49F42D](https://user-images.githubusercontent.com/34562805/96206840-5cbae880-0f9c-11eb-8cf2-d6d312a96210.png)

![F30A926E-0B5A-4a54-A00F-8F7B1F6F683E](https://user-images.githubusercontent.com/34562805/96206855-66dce700-0f9c-11eb-8423-0505975a3ac7.png)

![15E08820-B0E8-42b4-A30A-C2365964D113](https://user-images.githubusercontent.com/34562805/96206889-7a884d80-0f9c-11eb-965b-2154d9dae808.png)

![510F3459-7CFD-4f77-BEE1-4E25AED51D51](https://user-images.githubusercontent.com/34562805/96206906-8411b580-0f9c-11eb-9bdb-0a61735d4c95.png)

![F5DDEAC5-B8E1-47e8-9D87-92265358D242](https://user-images.githubusercontent.com/34562805/96240470-86dbcd00-0fd3-11eb-8749-68feb3f3a26b.png)

![07DD490A-9F6C-4da1-8537-6693F792951A](https://user-images.githubusercontent.com/34562805/96531719-d87aa500-12bc-11eb-8a6d-b495cc39198c.png)

***

分布式配置中心

### 11. SpringCloud Config

![F033BB2C-B230-45cd-91E0-BA9D1EE7DDED](https://user-images.githubusercontent.com/34562805/96554454-23121680-12e9-11eb-9822-759812c618f1.png)

![4D15B616-ADDB-4698-8D27-44F8BDC29B4E](https://user-images.githubusercontent.com/34562805/96554501-31f8c900-12e9-11eb-932c-44eb4113ff0b.png)

***

 消息总线

### 12 SpringCloud Bus

curl -X POST "http://localhost:3344/actuator/bus-refresh"

![83384408-117F-4ec5-B6A6-FEE4A2435BFE](https://user-images.githubusercontent.com/34562805/96569393-a8062b80-12fb-11eb-8830-4255760aef88.png)

![8301D9A9-52C4-4bc7-83F3-0C1A22A3A20C](https://user-images.githubusercontent.com/34562805/96569431-b5bbb100-12fb-11eb-8438-c08b70ef0686.png)

![4257AF2A-B6BE-4a5e-8379-000EE59A756E](https://user-images.githubusercontent.com/34562805/96569457-beac8280-12fb-11eb-8631-f5a2c24c0c35.png)

![57726C7D-C285-4c8d-9F0B-E0A991056F65](https://user-images.githubusercontent.com/34562805/96569538-db48ba80-12fb-11eb-9c34-980a651ba562.png)

***

消息驱动

### 13. SpringCloud Stream

屏蔽底层消息中间件的差异，降低切换成本，统一消息的编程模型

Stream中的消息通信方式遵循发布-订阅模式 Topic主题进行广播

![425E2782-DDA7-4e96-B52C-2F74D767F6B0](https://user-images.githubusercontent.com/34562805/96666093-ff9ea880-1388-11eb-9073-4b87bf794749.png)

![2E75E795-5403-4898-94C4-E4F10AC2FD38](https://user-images.githubusercontent.com/34562805/96666113-0c230100-1389-11eb-8c4f-df66ea4e4a10.png)

![813750A5-CAE5-4420-A18D-01E82A5AA2BE](https://user-images.githubusercontent.com/34562805/96666131-147b3c00-1389-11eb-94ea-649c0b2d57e2.png)

消息分组 消息持久化

![98691F28-8581-4716-A54D-7C16574DFA06](https://user-images.githubusercontent.com/34562805/96680815-cd04a800-13a8-11eb-8070-4aafd3cea147.png)

***

分布式请求链路跟踪

### 14. SpringCloud Sleuth

提供了一套完整的服务跟踪解决方案，在分布式系统中提供追踪解决方案并且兼容支持了Zipkin

![47FAA2AD-BFFA-43ff-915F-6A9C89616A8B](https://user-images.githubusercontent.com/34562805/96684416-1efbfc80-13ae-11eb-8092-2a11ef1ae6e1.png)

***

## SpringCloud Alibaba

![3D3ABEF5-2672-47b6-A099-21C0DD6F24F4](https://user-images.githubusercontent.com/34562805/96818382-ffb7aa80-1453-11eb-9d84-ff4c738901ff.png)

![D1FE9BC6-000B-4720-9A96-B8B63E28CFEC](https://user-images.githubusercontent.com/34562805/96837752-7c10b480-1479-11eb-813a-4daea9f9da34.png)

![50D9934C-AB81-4d87-A6D8-CB8DAF4C1B45](https://user-images.githubusercontent.com/34562805/96837777-8468ef80-1479-11eb-9810-680b6d610073.png)

