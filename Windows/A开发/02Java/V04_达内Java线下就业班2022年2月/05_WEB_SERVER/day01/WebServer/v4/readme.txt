本版本开始解析请求
一个请求由三部分构成:请求行，消息头，消息正文
并且各部分又分别有很多个值，因此我们设计一个类HttpRequest，使用它的实例来保存
客户端发送过来的一个请求内容以便将来处理请求时使用。

实现:
1:新建一个包:com.webserver.http
  这个包里将来保存所有有关HTTP协议的类。
2:在http包中新建一个类:HttpRequest
  并定义构造方法和一系列方法来完成HttpRequest功能。
3:ClientHandler在解析请求时只需要实例化HttpRequest即可，而实际读取客户端
  发送的请求工作则交给HttpRequest自行完成。
