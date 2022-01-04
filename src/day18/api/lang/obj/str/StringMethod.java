package day18.api.lang.obj.str;

public class StringMethod {

    String str = "Hello java";
    //charAt(index) : 문자열 인덱스에 따른 글자 반환
    char c = str.charAt(4);

    // substring(): 문자열의 특정 범위를 추출
    String ss1 = str.substring(6); // 6번부터 끝까지 슬라이싱


    String ss2 = str.substring(1,5); // 1번부터 5번까지 슬라이싱

    // length() : 문자열의 총 길이 반환
    int len = str.length();

    //indexOf(), lastIndexOf(): 특정 문자나 단어의 첫글자 인덱스 반환
    int firsr = str.indexOf("l");
    int last = str.lastIndexOf("l");

    //java라는 단어가 포함되어있으면 첫글자인덱스 반환
    // 포함되어있지 않으면 -1 반환
    int java = str.indexOf("java");

    //일괄 대소문자 변경
    //toLowerCase(), toUpperCase()
    String str2 = "HeLLo PoRoRO";

    // 파일 경로에서 확장자 추출
    String filePath = "D:/local/img/2022/01/03/dog.png";
    String ext = filePath.substring(filePath.lastIndexOf(".")+1);

    //replace(old,new): 문자열 내부에 old문자를 찾아서 new문자로 일괄 변경경
}
