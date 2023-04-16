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

## 2. Tuple

- Tuple adalah kumpulan data yang tidak dapat diubah (immutable) dan diindeks serta diurutkan (ordered).

- Imutable artinya tidak dapat diubah, seperti mengubah, menambah, dan menghapus.

- Tuple dapat berisi berbagai tipe data, bahkan tuple lainnya.

- syntax, my_tuple = (1, 2, 3, 4, 5)

```python
my_tuple = ("Fitron", "Azkia", "Nara")

print(my_tuple)
```

- Assigning Tuple, meskipun tuple tidak dapat diubah, tetapi bisa diassign ke variabel lain.

```python
my_tuple = ("Fitron", "Azkia", "Nara")

my_tuple = my_tuple + ("Budi",) # harus ditambahkan koma (,) jika hanya 1 data

print(my_tuple) # ('Fitron', 'Azkia', 'Nara', 'Budi')
```

## 3. List sort() method

- List sort() method digunakan untuk mengurutkan list secara ascending (kecil ke besar).

- List sort() method tidak mengembalikan nilai, tetapi mengubah list yang sudah ada.

- List sort() method memiliki parameter reverse, jika reverse = True, maka akan mengurutkan secara descending (besar ke kecil).

```python
my_list = [1, 5, 3, 2, 4]

my_list.sort() # [1, 2, 3, 4, 5]
```

```python
# List of Tuples
companies = [('Google', 2019, 134.81),
             ('Apple', 2018, 260.2),
             ('Facebook', 2017, 70.7)]

# Sort by year
def sort_by_year(company):
    return company[1]

companies.sort(key=sort_by_year)

print(companies) # [('Facebook', 2017, 70.7), ('Apple', 2018, 260.2), ('Google', 2019, 134.81)]
```
