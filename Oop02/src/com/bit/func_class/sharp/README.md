# 클래스 방식의 프로젝트

# 최초의 spec

## 사각형을 회전시켜라

* - RectClass를 만든다.
* - rotate() method를 만든다.

# Spec이 upgrade 된다.

## 삼각형을 회전시켜라

* - TriAngleClass를 만든다
* - rotate() method를 만든다.

# 두개의 class에 중복된 rotate라는 method가 생겨 났다.

## SharpClass를 만들어 중복된 method를 한곳으로 집중시킨다.

* SharpClass를 생성한다.

* SharpClass에 String strSharp 속성과, rotate method를 작성한다.

* RectClass와 TriAngleClass에서 SharpClass를 상속한다.

* RectClass와 TriAngelClass의 생성자를 작성하고, strSharp에 클래스를 구분하는 이름을 넣어준다.

# Spec이 다시 Upgrade 된다

## 원을 회전시켜라

* CircleClass를 만들고 SharpClass를 상속하고 생성자 method에서 strSharp 이름을 "원"으로 정하여 간단히 Upgrade를 하였다.

# Spec이 변경되었다.

### 원은 회전을 시켜도 모양 변화가 없어 회전이 되었는지 알 수 없다.

## 원의 어느 한 접점을 '회전 중심'으로 하고, '회전 중심'을 기준으로 원을 회전시켜 포물선 회전하라


## CircleClass에 rotate() method를 Override 하여 Spec에 맞도록 변경한다.


## 여전히 사각형과 삼각형의 회전방법은 변함이 없고, 오류없고 업그레이드 된 프로젝트가 완성되었다.