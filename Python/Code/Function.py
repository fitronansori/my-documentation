# def my_first_function():
#     print("Hello World")

# my_first_function()

# def full_name(fname, lname) :
#     print(f"Hello {fname} {lname}")
    
# full_name("Fitron", "Ansori")

# def fnc_default(country = "Indonesia"):
#     print(f"I am from {country}")

# fnc_default("USA") # I am from USA
# fnc_default() # I am from Indonesia


# def tri_recursion(k):
#   # base case
#   if(k > 0):
#     # recursive case
#     result = k + tri_recursion(k - 1)
#     print(result)
#   else:
#     result = 0
#   return result

# tri_recursion(6)

# def get_full_name(first_name, last_name, formatter):
#     return formatter(first_name, last_name)


# full_name = get_full_name(
#     'John',
#     'Doe',
#     lambda first_name, last_name: f"{first_name} {last_name}"
# )
# print(full_name)

# full_name = get_full_name(
#     'John',
#     'Doe',
#     lambda first_name, last_name: f"{last_name} {first_name}"
# )
# print(full_name)