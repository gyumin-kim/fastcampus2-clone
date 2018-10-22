IntelliJ 로 개발. (maven을 이용)

* WAS runtime설정 - 내가만든 웹 애플리케이션을 실행해줄 WAS를 설정.

-- src - main - java
              - resources
       - test - java
              - resources
- webapp 폴더 - html, css, WEB-INF 등

----------> 웹 어플리케이션 실행( IDE에서 사용할 WAS를 설정. ) ---->

Web Application 의 구조
   |
   +---  WEB-INF - web.xml (서블릿 스펙 3.0 이상에서는 없어도 된다.)
   |             - lib 폴더 (각종 jar 파일)
   |             - classes 폴더 (패키지 폴더, 각종 클래스파일)
   |             - 여러가지 폴더, 파일  (jsp WEB-INF이후에 놓여지는 것을 추천한다.)
   |
   +---- 여러가지 폴더, 파일 (jsp가 있을 수 있는데 추천하지 않는다.)
        js, css, html, images 와 같은 정적인 파일들이 있을 수 있다.

위의 내용을 jar라는 명령으로 압축을 하여 확장자가 war이란 파일을 만든다.
해당 파일이 WAS에 deploy(배치)된다.

추천 검색어
war 파일의 구조 , web application 구조

---------------------------------------------------
https://code.visualstudio.com/

에디터 다운로드 설치
---------------------------------------------------
Tocmat 설치

http://tomcat.apache.org/

tar xvfz 파일명.tar.gz

상식 : tar라는 명령은 디렉토리이하를 하나의 파일로 만들어준다.
      gzip 라는 명령은 압축.

tomcat 8 버전을 다운로드하여 압축을 해제한다.

tomcat 8
  +
  ----- bin : 실행파일 startup.bat (sh), 종료파일 shutdown.bat (sh)
  ----- conf : tomcat설정파일이 있다.
  ----- webapps : 웹애플리케이션들이 있는 경로. ROOT라는 폴더의 context path는 "" 이다.
                  http://localhost:8080/{context path}

startup.bat 파일의 마지막 줄의 start -> run으로 수정.
run으로 수정하면 새창으로 실행이 안되고 현재 화면에서 실행된다.

bin 디렉토리로 이동해서

./startup.sh

위와 같이 실행하고

http://localhost:8080/{context path}/index.jsp 를 확인한다.
http://localhost:8080/{context path}/tomcat.gif

webapps/docs 폴더는 context path가 docs이다.
http://localhost:8080/apr/파일명


tomcat 을 종료한다. 기존 startup.sh을 ctrl + c로 종료하던지
shutdown.sh을 실행한다.
------------------------------------------
IntelliJ

- 커뮤니티 버전은 웹 개발을 지원하지 않는다.

Web Application Project 생성하기

- Maven 프로젝트를 선택한다.
- group id : my.examples.web
- artifact id : firstweb

패키징은 war 파일이 되기 위하여 다음과 같이 설정한다.
<packaging>war</packaging>

pom.xml 파일에 다음과 같은 의존성을 추가한다.
서블릿과 jsp와 관련된 라이브러리는 tomcat이 이미 가지고 있다.
<scope>provided</scope> 옵션은 해당 라이브러리가 컴파일(개발할때만)할때만 사용된다.
배포될때는 제외되고 배포된다.

    <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>3.1.0</version>
            <scope>provided</scope>
        </dependency>

        <dependency>
            <groupId>javax.servlet.jsp</groupId>
            <artifactId>jsp-api</artifactId>
            <version>2.2</version>
            <scope>provided</scope>
        </dependency>

        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>
    </dependencies>

WEB-INF 디렉토리를 포함하여 웹과 관련된 파일이 있는 경로를 지정하는 플러그인을 설정한다.

            <!-- webapp 폴더 변경. http://antop.tistory.com/149 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.4</version>
                <configuration>
                    <warSourceDirectory>webapp</warSourceDirectory>
                </configuration>
            </plugin>


서블릿 클래스를 작성한다.

package my.examples.web.firstweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        LocalDateTime today = LocalDateTime.now();
        out.println("today : " + today.toString());
        out.close();
    }
}
