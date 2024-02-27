# SignAPI
Spring을 공부하며 MVC 구조를 따라 구현한 회원가입 기능입니다.

### 비즈니스 요구사항 정리
- 데이터: 회원ID, 이름
- 기능: 회원 등록, 조회
- 아직 데이터 저장소가 선정되지 않음(가상의 시나리오), 따라서 Repository를 인터페이스로 구현해두고 단순 내장 메모리를 사용하는 구현체를 만들어두었습니다. 추후 DB가 결정되면 구현체를 교체할 예정입니다. 

### 계층 구조
![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/810d0899-d84f-4116-a06e-dd37a4435bb2)

- 컨트롤러: 웹 MVC의 컨트롤러 역할
- 서비스: 핵심 비즈니스 로직 구현
- 리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리
- 도메인: 비즈니스 도메인 객체, 예) 회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨

### 동작화면

![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/9a683d38-3803-45bf-b632-34c02da49896)
![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/cf5276ff-ae71-478e-ad03-700991387dfb)
![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/80105c39-2771-4577-93f5-dbfe6f442f88)
![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/6afb7e8a-40f3-4d3d-87d3-0d1e33068fda)
![image](https://github.com/hongjunehuke/SignAPI/assets/83629193/b4da692f-af07-45af-b3ff-4e590129f036)
