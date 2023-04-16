# Lists

## 1. List

- List adalah kumpulan data yang dapat diubah (mutable) dan diindeks serta diurutkan (ordered).

- List dapat berisi berbagai tipe data, bahkan list lainnya.

- syntax, my_list = [1, 2, 3, 4, 5]

```python
my_list = [1, 2, 3, 4, 5]

print(my_list)
```

- Mengakses list

```python
my_list = ['Fitron', 'Ansori', 'Azkia', 'Budi', 'Nara']

print(my_list[0]) # Fitron
print(my_list[1]) # Ansori
print(my_list[2]) # Azkia
print(my_list[3]) # Budi
print(my_list[4]) # Nara
```

- Modifikasi, Menambah, dan Menghapus List

```python
my_list = ['Fitron', 'Ansori', 'Azkia', 'Budi', 'Nara']

# Mengubah list dengan indeks
my_list[0] = 'Fitron Ansori'
print(my_list) # ['Fitron Ansori', 'Ansori', 'Azkia', 'Budi', 'Nara']

# Menambah list dengan append
my_list.append('Fitron') # ['Fitron Ansori', 'Ansori', 'Azkia', 'Budi', 'Nara', 'Fitron']

# Menambah list dengan insert
my_list.insert(0, 'Fitron') # ['Fitron', 'Fitron Ansori', 'Ansori', 'Azkia', 'Budi', 'Nara', 'Fitron']

# Menghapus list dengan pop (default index -1)
my_list.pop() # ['Fitron', 'Fitron Ansori', 'Ansori', 'Azkia', 'Budi', 'Nara']

# Menghapus list dengan del
del my_list[0] # ['Fitron Ansori', 'Ansori', 'Azkia', 'Budi', 'Nara']

# Menghapus list dengan remove
my_list.remove('Ansori') # ['Fitron Ansori', 'Azkia', 'Budi', 'Nara']

# Menghapus list dengan clear
my_list.clear() # [] (kosong)
```
