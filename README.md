
<h1> 더 자바, 애플리케이션을 테스트하는 방법 <h1>


이번 강의는 [더 자바, 애플리케이션을 테스트하는 방법 - 백기선] 사이드 프로젝트에 테스트를 도입하기 위해 듣게 됐습니다. 더하여 [판교 퇴근길 밋업 with 인프런 #05 백엔드 테스트코드] 참가하게 됐으니 테스트 코드를 미리 공부해서 이해할 수 있도록 해봐야겠다는 생각이 들었습니다.

# JUnit5

Junit은 Java에서 독립 된 단위테스트를 지원해주는 프레임워크이다. 단위테스트란 특정 소스코드의 모듈이 의도한 대로 잘 작동하는 지 검증하는 테스트입니다. 자바 개발자가 가장 많이 사용하는 테스팅 프레임워크로 JUnit 플랫폼 + JUnit Jupiter + JUnit 빈티지로 구성되어 있다. 사용하기 위해서는 자바 8 이상을 필요로 한다. 
JUnit is used by 93% of Java devs who do Unit testing, while 51% use Mockito.

JUnit 플랫폼 : JVM에서 테스트 프레임워크를 시작하기 위한 기반역할로 API를 정의합니다.

JUnit Jupiter : 테스트와 확장 기능을 작성하기 위한 프로그래밍 모델과 확장모델을 결합한 것이다. (JUnit Jupiter is the API for writing tests using JUnit 5)

JUnit Vintage : 플랫폼에서  JUnit 3 및 JUnit 4 기반 테스트를 실행하기 위한 를 제공한다.
