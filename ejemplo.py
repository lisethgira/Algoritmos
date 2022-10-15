tipo_necesidad = int(input("Que tipo de necesidad vas a hacer?"))
#tipo_necesidad = 1
genero = "hombre"

def hacer_necesidades(tipo_necesidad, genero):
    print("Entrar al baño")
    print("Bajarse interiores")
    if tipo_necesidad == 1:
        if genero == "mujer":
            print("Sentarse en taza")
        else:
            print("Hacerse en frente")
    elif tipo_necesidad == 2:
        print("Sentarse en taza")
    else:
        print("Eres un mutante")
    print("Hacer necesidad")
    print("Limpiarse")
    print("Poner interiores")
    print("Vaciar")
    print("Lavarse")
    print("Salir del Baño")


print("Abrir los ojos")
print("Sentarse en la cama")
print("Caminar al baño")
hacer_necesidades(tipo_necesidad, genero)
print("Salir para el Trabajo")


