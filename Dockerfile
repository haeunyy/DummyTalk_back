# 기본 이미지로 OpenJDK를 사용
FROM openjdk:17-jdk-slim

# 작업 디렉토리 설정
#WORKDIR /app

# 호스트의 JAR 파일을 이미지로 복사
#COPY target/dummy-dep.jar /app/app.jar

# 애플리케이션 실행 명령어
#CMD ["java", "-jar", "app.jar"]


ADD /build/libs/*.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]