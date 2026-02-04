from datetime import date, time, datetime, timedelta
hoy = date.today()
print(hoy)
print(hoy.day)
print(hoy.month)
print(hoy.year)

print("fecha especifica")

happyBirthday = date(year=1968, month=10, day=8)
print(happyBirthday)

hora = time(hour=9, minute=30, second=0)
print(hora)

ahora = datetime.now()
print(ahora)

citaMedico = datetime(year=2020, month=10, day=8, hour=9, minute=30, second=0)
print(citaMedico)

citaFormateada = citaMedico.strftime("%A (%w) %d/%m/%Y a las %H:%M %p")
print(citaFormateada)

fecha = "08/10/2020"
miObjetoFecha = datetime.strptime(fecha, "%d/%m/%Y")
print(miObjetoFecha)

if ahora < miObjetoFecha:
    print(f"{hoy} es menor que {miObjetoFecha}")
else:
    print(f"{hoy} es mayor que {miObjetoFecha}")

mas67dias= ahora + timedelta(weeks=2, days=67, hours=9, minutes=30, seconds=0)
print(mas67dias)