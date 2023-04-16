# List is a collection which is ordered and changeable. Allows duplicate members.
my_stack = ["Front-end Developer", "Back-end Developer", "Full-stack Developer"]

print(my_stack)

# Mengubah isi list
my_stack[0] = "UI/UX Designer"
print(my_stack)

# Menambahkan isi list
my_stack.append("Front-end Developer")
my_stack.insert(1, "DevOps")
print(my_stack)

# Menghapus isi list
my_stack.remove("DevOps") # Menghapus DevOps
my_stack.pop() # Menghapus yang paling belakang
del my_stack[0] # Menghapus yang paling depan
print(my_stack)