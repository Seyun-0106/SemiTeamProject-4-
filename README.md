# 멀티캠퍼스8회차 4조(이게 왜 되죠?) 첫 번째 프로젝트
## 오늘 날씨 어때?

### ✈️ 소개
<img width="50%" src="https://user-images.githubusercontent.com/96780311/165444630-f3ac1235-5fe0-4be6-b2e6-a0e4e759ad5f.png"/>

### ⏰ 개발 기간
2022년 4월 5일 → 2022년 4월 21일

### 👩‍💻 멤버 구성
- 서범석(팀장)
- 김도현
- 박세윤
- 이정은
- 장현주
- 정우준  

### 📌 기술
- HTML, CSS, Bootstrap, JavaScript, Ajax, jQuery
- Java, SpringBoot(Gradle), Apache Tomcat
- Mysql, MyBatis
- GitHub

### 📌 주요 기능
<ul>
<li>
회원관리
<ul>
 1) 회원가입<br />
- id, pwd, 이메일, 닉네임, Q&A, 프로필 사진 입력
<br />
- 아이디 중복확인
<br />
 - 유효성 검사
<br />
</ul>
<br />
 <ul>
2) 로그인<br />
&nbsp;- 회원로그인
<br />
▸아이디, 비밀번호 입력
<br />
▸마이페이지, 음식 추천, 코디 추천 접근 가능
<br />
&nbsp;- 관리자 로그인<br />
▸관리자 페이지 접근 가능
<br />
</ul>
<br />
<ul>
3)로그아웃<br />
- 로그인 정보 삭제(세션 삭제)
<br />
- 이페이지, 음식, 코디 추천 페이지 접근 불가
<br />
</ul>
</li>
<br />
<li>
회원 정보
<ul>
1) 회원 정보 보기
<br />
- 나의 리뷰 보기(리뷰 수정, 리뷰 삭제)
<br /><br />
2) 회원 정보 수정
<br />
- 비밀번호 확인
<br />
- 닉네임, 프로필, 비밀번호 수정
<br />
- 유효성 검사
<br /><br />
3) 회원탈퇴
<br />
- 비밀번호 확인
<br />
- 유효성 검사
<br />
- 회원 삭제
<br /><br />
4) 회원 정보 찾기
<br />
- 아이디 및 비밀번호 찾기
<br />
- Q&A, 이메일 확인
<br />
- 유효성 검사
<br />
</ul>
</li><br />
<li>코디 추천<ul>
1) 코디 추천 보기<br />
- 온도, 날씨 데이터가 반영된 추천 코디 이미지 보기
<br />
</ul>
<br />
<ul>
2) 코디 목록 보기<br />
- 추천 외 카테고리별 코디 목록 보기<br />
(All / Man / Woman, 코디 카테고리)
<br />
</ul>
<br />
<ul>
3) 코디 찜하기<br />
- 원하는 코디를 찜해놓으면 카테고리 My Pick에서 한번에 보기<br />
<br />
</ul>
<br />
</li>
<li>
음식 추천
<ul>
1) 음식 추천 받기<br />
- 온도, 날씨, 날짜, 추천 음식명, 음식 종류, 음식 이미지, 데이터
가져오기
<br />
- 데이터 맞춤 추천 음식 보기
<br />
- 추천 음식을 클릭하면 지도 보기로 이동
<br />
</ul>
<br />
<ul>
2) 음식 추천 지도<br />
&nbsp;- 지도 보기
<br />
▸ 추천 음식 데이터, 사용자 위치 데이터 가져오기
<br />
▸ 데이터 맞춤 추천 음식점 보기
<br />
&nbsp;- 지역 검색
<br />
▸ 특정 추천 음식점에 대한 원하는 지역 검색 가능
<br />
&nbsp;- 음식점 정보 미리보기
<br />
▸ 상호명, 별점 평균 데이터 가져오기
<br />
▸ 리뷰 데이터 가져오기
<br />
&nbsp;- 음식점 정보 상세보기
<br />
▸ 가게 상호명, 주소, 전화번호, 홈페이지 URL, 평균 평점, 리뷰 데이터
가져오기
<br />
</ul>
<br />
</li>
<li>
관리자 페이지
<ul>
1) 회원 관리<br />
- 전체 회원정보 조회 및 삭제
<br />
- 전체 음식점 리뷰 조회 및 삭제
<br />
</ul><br />
<ul>
2) 음식 추천 페이지 관리<br />
&nbsp;- 음식 추가
<br />
▸ 음식명, 음식 종류, 계절, 기온, 날씨, 음식 이미지, 이벤트, 우선순위 입력
<br />
&nbsp;- 음식 수정
<br />
▸ 음식명, 음식 종류, 계절, 기온, 날씨, 음식 이미지, 이벤트, 우선순위 수정
<br />
</ul><br />
<ul>
3) 코디 추천 페이지 관리<br />
&nbsp;- 코디 추가
<br />
▸ 이미지, 이름, 스타일, 성별, 온도, 날씨 정보 입력
<br />
&nbsp;- 코디 수정
<br />
▸ 이미지, 이름, 스타일, 성별, 온도, 날씨 정보 수정
<br />
 &nbsp;- 코디 삭제
<br />
</ul>
</li>
</ul>

### 📌 나의 역할
<p>✅ 코디 사용자 페이지 모든 백엔드 기능 구현(DB 설계, Controller, DAO, VO 등)</p>
<p>✅ 코디 관리자 페이지 모든 백엔드 기능 구현(코디 추가, 수정, )</p>
<p>✅ 관리자 페이지 css 통일 및 디자인 피드백</p>


