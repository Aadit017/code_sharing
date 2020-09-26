import csv
def write_csv(info_):
    with open("student_info.csv", "a" , newline="") as csv_file:
        writer=csv.writer(csv_file)

        if csv_file.tell()==0:
            writer.writerow(["Name", "Age", "Phone No.", "Email ID"])
        writer.writerow(info_)

cond=True
counter = 1
while(cond==True):
    student = input("Enter #{} student info in the following format with spaces in between: NAME AGE PHONE NO. EMAIL ID.\n".format(counter))
    student_info_list = student.split(" ")
    print("The information you have entered is: \n name: {}\n age: {}\n phone number: {}\n mail ID: {}"
          .format(student_info_list[0], student_info_list[1], student_info_list[2], student_info_list[3]))
    correction=input("If the values entered are correct press (yes) OTHERWISE (no)\n")
    if correction == "yes":
        write_csv(student_info_list)

        repeat = input("Do you want  to enter values for another student (yes/no)\n")
        if repeat == "yes":
            counter+=1
            cond == True
        else:
            break
    else:
        print("Uh! Oh! Enter the values again!")