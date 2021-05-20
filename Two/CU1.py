#6001(출력하기1)
print("Hello");


#6002(출력하기2)
print("Hello World");


#6003(출력하기3)
print("Hello");
print("World");


#6004(출력하기4)
print("'Hello'");


#6005(출력하기5)
print('"Hello World"');


#6006(출력하기6)
print("\"!@#$%^&*()\'");


#6007(출력하기7)
print('\"C:\\Download\\\'hello\'.py\"');


#6008(출력하기8)
print('print(\"Hello\\nWorld\")');


#6009(문자 1개 입력받아 그대로 출력하기)
a = input()
print(a)

#6010(정수 1개 입력받아 int로 변환하여 출력하기)
n = input()
n = int(n)
print(n)

#6011(실수 1개 입력받아 변환하여 출력하기)
f = input()
f = float(f)
print(f)

#6012(정수 2개 입력받아 그대로 출력하기1)
a = input() 
b = input()
print(a)
print(b)

#6013(문자 2개 입력받아 순서 바꿔 출력하기1)
a=input()
b=input()
print(b)
print(a)

#6014(실수 1개 입력받아 3번 출력하기)
f=input()
f=float(f)
print(f)
print(f)
print(f)

#6015(정수 2개 입력받아 그대로 출력하기2)
a, b = input().split()
print(a)
print(b)

#6016(문자 2개 입력받아 순서 바꿔 출력하기2)
a, b = input().split()
print(b)
print(a)

#6017(문장 1개 입력받아 3번 출력하기)
a = input()
print(a, a, a)

#6018(시간 입력받아 그대로 출력하기)
a, b = input().split(':')
print(a, b, sep=':')

#6019(연월일 입력받아 순서 바꿔 출력하기)
y, m, d = input().split('.')
print(d, m, y, sep="-")

#6020(주민번호 입력받아 형태 바꿔 출력하기)
a, b = input().split('-')
print(a,b,sep='')

#6021(단어 1개 입력받아 나누어 출력하기)
s = input()
print(s[0])
print(s[1])
print(s[2])
print(s[3])
print(s[4])


#6022(연월일 입력받아 나누어 출력하기)
s = input()
print(s[0:2],s[2:4],s[4:6],sep=" ")

#6023(시분초 입력받아 분만 출력하기)
h,m,s=input().split(":")
print(m)

#6024(단어 2개 입력받아 이어 붙이기)
w1, w2 = input().split()
s = w1 + w2
print(s)

#6025(정수 2개 입력받아 합 계산하기)
a, b = input().split()
c = int(a) + int(b)
print(c)

#6026(실수 2개 입력받아 합 계산하기)
a = input()
b = input()
c = float(a) + float(b)
print(c)

#6027(10진 정수 입력받아 16진수로 출력하기1)
a = input()
n = int(a)        #입력된 a를 10진수 값으로 변환해 변수 n에 저장
print('%x'% n)    #n에 저장되어있는 값을 16진수(hexadecimal) 소문자 형태 문자열로 출력

#6028(10진 정수 입력받아 16진수로 출력하기2)
a = input()
n = int(a)     
print('%X'% n)     #n에 저장되어있는 값을 16진수 대문자 형태 문자열로 출력

#6029(16진 정수 입력받아 8진수로 출력하기)
a = input()
n = int(a, 16)
print('%o' % n)     #n에 저장되어있는 값을 8진수(octal) 형태 문자열로 출력

#6030(영문자 1개 입력받아 10진수로 변환하기)
n = ord(input())    #입력받은 문자를 10진수 유니코드 값으로 변환한 후, n에 저장
print(n)

#6031(정수 입력받아 유니코드 문자로 변환하기)
n = int(input())
print(chr(n))       #n에 저장되어 있는 정수 값을 유니코드 문자(chracter)로 바꿔 출력

#6032(정수 1개 입력받아 부호 바꾸기)
a=int(input())
print(-a)           #단항(unary) 연산자인 -(negative)를 변수 앞에 붙이면 부호가 반대인 값이 된다. 

#6033(문자 1개 입력받아 다음 문자 출력하기)
n = ord(input())
print(chr(n+1))

#6034(정수 2개 입력받아 차 계산하기)
a,b = input().split(" ")
c = int(a) - int(b)
print(int(c))

#6035(실수 2개 입력받아 곱 계산하기)
f1, f2= input().split(" ")
m = float(f1) * float(f2)
print(m)

#6036(단어 여러 번 출력하기)
w, n = input().split()
print(w*int(n))

#6037(문장 여러 번 출력하기)
n = input()
s = input()
print(int(n)*s)
