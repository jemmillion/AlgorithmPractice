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
