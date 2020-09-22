def old_macdonald(name):
    if len(name) > 3:
        return name[:3].capitalizecapitalize() + name[3:].capitalize()
    else:
        return 'Name is too short!'
print(old_macdonald("aadit "))