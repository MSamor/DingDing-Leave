# 基础镜像
FROM openjdk:8-jdk-alpine
# 对应pom.xml文件中的dockerfile-maven-plugin插件JAR_FILE的值
ARG JAR_FILE=target/dingding-0.0.1-SNAPSHOT.jar
# 复制打包完成后的jar文件到/opt目录下
COPY ${JAR_FILE} /opt/app.jar
# /data设为环境变量
ENV DATAPATH /data
# 挂载/data目录到主机,容器中/data文件会同步到主机的/var/lib/docker目录中
VOLUME $DATAPATH
# 启动容器时执行
ENTRYPOINT ["java","-jar","/opt/app.jar"]
# 挂载的端口
EXPOSE 8080
