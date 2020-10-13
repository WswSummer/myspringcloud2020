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

