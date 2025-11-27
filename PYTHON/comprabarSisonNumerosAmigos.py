num = 284
num2 = 220
suma_n1=0
suma_n2=0

for i in range(1,num):
    if num%i==0:
        suma_n1+=i
for j in range(1,num2):
    if num2%j==0:
        suma_n2+=j
if suma_n1==num2 and suma_n2==num:
    print(f"Los numeros {num} y {num2} son numeros amigos")
else:
    print(f"Los numeros {num} y {num2} no son numeros amigos")