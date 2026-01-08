# DemoNetbean

Một project demo Java (NetBeans) rất nhỏ chứa ví dụ OOP "Hello World".

## Cấu trúc chính
- demo1/
  - pom.xml (Maven module)
  - src/main/java/javaone/oop/OOPMain.java (entry point)
- Readme.md (bản này)
- .gitignore

## Yêu cầu
- JDK 21 (pom.xml sử dụng `maven.compiler.release=21`)
- Maven 3.x

## Build
Từ thư mục gốc của repository:

```bash
mvn -f demo1 clean package
```

## Chạy
- Chạy trực tiếp bằng Java sau khi build:

```bash
java -cp demo1/target/demo1-0.0.1.jar javaone.oop.OOPMain
```

- Hoặc chạy bằng Maven (không cần đóng gói jar):

```bash
mvn -f demo1 exec:java -Dexec.mainClass="javaone.oop.OOPMain"
```

## Ghi chú
- Đã cập nhật `demo1/pom.xml` để đồng bộ `Main-Class` với `javaone.oop.OOPMain` và thêm plugin để tạo jar chạy được.
- Đã thêm `.gitignore` để loại trừ file build và cấu hình IDE.

## Muốn mở rộng
- Thêm test (JUnit) trong `demo1/src/test`.
- Thêm GitHub Actions để CI (build và test tự động).
- Bổ sung file LICENSE nếu muốn public.

Nếu bạn muốn, mình có thể tạo sẵn các thay đổi trên (README, test, CI).