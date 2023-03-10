# shttpd 만들기
---
- 개요 : python 에 SimpleHTTPServer 라는 모듈이 있습니다. 유사한 프로그램을 작성합니다.
- 구현 기능

  1. 포트번호 인자로 받아 실행
  2. 포트번호를 listen. 멀티세션은 선택?
  3. 실행된 디렉토리를 루트로 지정 - 요청에 대한 String parsing 필요
  4. GET METHOD 구현
  5. POST( + Multipart/form-data ) METHOD 구현
  6. DELETE METHOD 구현
  7. 로깅 기능 구현 - 시간, 요청 method, 경로, 요청 결과 응답 코드, 응답 크기, 응답 시간

- Status Code

  1. 200 : 존재하는 파일에 대한 GET 요청시
  2. 204 : 요청한 삭제 요청이 유효하고 진행 완료 후 응답 | 존재하지 않는 파일에 대한 삭제 요청 시
  4. 403 : 읽기 권한이 없는 파일 요청시 | 삭제가 불가능한 파일에 대한 삭제 요청 시
  5. 404 : 존재하지 않는 파일이나 경로 요청시
  6. 405 : Multipart 업로드 요청이 아닌 POST 요청시
  7. 409 : Multipart 업로드 요청 중 파일명 중복 발생 시
