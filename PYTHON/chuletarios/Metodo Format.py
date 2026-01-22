

str1 = 'leche'
str2 = 'casar'

# print('Arroz con leche me quiero casar')
# print('Arroz con ' + str1 + ' me quiero ' + str2)
# print('Arroz con {str_1} me quiero {str_2}'.format(str_1 = 'leche',  str_2 = 'casar'))

texto = 'Arroz con {} me quiero {}'
# print(texto.format(str1, str2))

nombre = 'Kevin'

# print('Hola, mi nombre es {}'.format(nombre))
# print('Hola, mi nombre es {:10}. Mucho Gusto :D'.format(nombre))
# print('Hola, mi nombre es {:<10}. Mucho Gusto :D'.format(nombre))
# print('Hola, mi nombre es {:>10}. Mucho Gusto :D'.format(nombre))
# print('Hola, mi nombre es {:^10}. Mucho Gusto :D'.format(nombre))

numero = 3.14159
print('El numero PI es: {:.2f}'.format(numero))
numero = 1000
print('El numero es: {:b}'.format(numero))
print('El numero es: {:o}'.format(numero))
print('El numero es: {:x}'.format(numero))
print('El numero es: {:e}'.format(numero))