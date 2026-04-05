import os
import shutil

source = input("Enter folder path: ")

for file in os.listdir(source):
    path = os.path.join(source, file)

    if os.path.isfile(path):
        if file.endswith(".jpg") or file.endswith(".png"):
            folder = "Images"
        elif file.endswith(".pdf") or file.endswith(".docx"):
            folder = "Documents"
        else:
            folder = "Others"

        folder_path = os.path.join(source, folder)

        if not os.path.exists(folder_path):
            os.mkdir(folder_path)

        shutil.move(path, os.path.join(folder_path, file))

print("Files organized successfully!")
