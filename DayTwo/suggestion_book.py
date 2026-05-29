import random

books = [
    {"name": "Money Man", "pages": 98},
    {"name": "Jungle Boy", "pages": 79},
    {"name": "Happy Life", "pages": 110}
]


def add_book(name, pages):
    for book in books:
        if book["name"] == name:
            print("Book already exists")
            return

    books.append({"name": name, "pages": pages})
    print("Book added successfully")


def get_suggestion():
    book = random.choice(books)
    page = random.randint(1, book["pages"])

    print("Book for the Day")
    print("Title:", book["name"])
    print("Page:", page)


def remove_book(name):
    for book in books:
        if book["name"] == name:
            books.remove(book)
            print("Book removed successfully")
            return

    print("Book not found")


def update_book(old_name, new_name):
    for book in books:
        if book["name"] == old_name:
            book["name"] = new_name
            print("Book updated successfully")
            return

    print("Book not found")


def show_books():
    count = 1
    print("All Books")

    for book in books:
        print(count, book["name"], book["pages"])
        count += 1
