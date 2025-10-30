// ============================================
// TEMPLATE STRUKTUR OOP JAVA
// ============================================

// 1️⃣ DRIVER CLASS (Main Class / Test Class)
// ============================================
// Fungsi: Menjalankan program, testing, input/output
// Nama: [NamaClass]Driver atau [NamaClass]Test atau Main

import java.util.Scanner;

public class PersonDriver {
    public static void main(String[] args) {
        
        // STEP 1: Persiapan (Scanner, variabel, dll)
        Scanner sc = new Scanner(System.in);
        
        // STEP 2: Input data
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        // STEP 3: Buat object & gunakan constructor
        Person person1 = new Person(name, age);
        
        // STEP 4: Panggil method & proses
        person1.introduce();
        person1.haveBirthday();
        
        // STEP 5: Output hasil
        System.out.println("After birthday: " + person1.getAge());
        
        sc.close();
    }
}


// 2️⃣ MODEL CLASS (Blueprint / Recipe)
// ============================================
// Fungsi: Mendefinisikan struktur data dan perilaku object
// Nama: [NamaObject] (kata benda, PascalCase)

class Person {
    
    // A. FIELDS / ATTRIBUTES (Data / Properties)
    // ========================================
    // Access modifier: private (encapsulation)
    // Naming: camelCase
    
    private String name;      // atribut 1
    private int age;          // atribut 2
    private String address;   // atribut 3
    
    
    // B. CONSTRUCTORS (Pembuat Object)
    // ========================================
    // Fungsi: Inisialisasi nilai awal object
    // Nama: SAMA dengan nama class
    // Tidak ada return type
    
    // Constructor 1: Default (tanpa parameter)
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Unknown";
    }
    
    // Constructor 2: Dengan parameter (overloading)
    public Person(String name, int age) {
        this.name = name;           // this.x = field, x = parameter
        this.age = age;
        this.address = "Unknown";
    }
    
    // Constructor 3: Semua parameter
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    
    // C. GETTERS (Accessor Methods)
    // ========================================
    // Fungsi: Mengambil/membaca nilai field
    // Format: get + NamaField
    // Return type: sesuai tipe data field
    
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    
    // D. SETTERS (Mutator Methods)
    // ========================================
    // Fungsi: Mengubah nilai field
    // Format: set + NamaField
    // Return type: void
    // Parameter: nilai baru
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        if (age >= 0) {  // validasi
            this.age = age;
        }
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    // E. BEHAVIOR METHODS (Instance Methods)
    // ========================================
    // Fungsi: Aksi/perilaku yang bisa dilakukan object
    // Naming: verb (kata kerja)
    
    public void introduce() {
        System.out.println("Hi, I'm " + this.name + 
                          " and I'm " + this.age + " years old.");
    }
    
    public void haveBirthday() {
        this.age++;
        System.out.println("Happy birthday! Now you're " + this.age);
    }
    
    public boolean isAdult() {
        return this.age >= 18;
    }
    
    
    // F. UTILITY METHODS (Static Methods)
    // ========================================
    // Fungsi: Method yang tidak bergantung pada object tertentu
    // Keyword: static
    // Dipanggil: NamaClass.namaMethod()
    
    public static int compareAge(Person p1, Person p2) {
        return p1.age - p2.age;
    }
    
    public static Person createDefaultPerson() {
        return new Person("Default", 0);
    }
    
    
    // G. SPECIAL METHODS
    // ========================================
    
    // toString(): Representasi string dari object
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + 
               ", address='" + address + "'}";
    }
    
    // equals(): Membandingkan dua object
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}


// ============================================
// CHEAT SHEET: URUTAN MENULIS CODE OOP
// ============================================

/*
📝 LANGKAH-LANGKAH MENULIS OOP:

1. IDENTIFIKASI OBJECT
   - Apa object yang akan dibuat? (kata benda)
   - Contoh: Person, Car, Book, Student

2. TENTUKAN ATTRIBUTES (Fields)
   - Data apa yang dimiliki object?
   - Contoh Person: name, age, address

3. BUAT CONSTRUCTORS
   - Bagaimana cara membuat object?
   - Minimal 1: default atau dengan parameter

4. BUAT GETTERS & SETTERS
   - Cara mengakses dan mengubah data
   - Encapsulation!

5. BUAT BEHAVIOR METHODS
   - Apa yang bisa dilakukan object?
   - Contoh: introduce(), walk(), study()

6. BUAT STATIC METHODS (jika perlu)
   - Utility functions yang tidak butuh object
   - Contoh: compareAge(), calculate()

7. BUAT DRIVER CLASS
   - Testing dan menjalankan program
   - Input → Create Object → Process → Output

⚡ TIPS:
✅ Satu file bisa banyak class, tapi hanya 1 public class
✅ Public class = nama file
✅ Use 'this' keyword untuk clarity
✅ Validasi input di setter
✅ Method name: verb (kata kerja)
✅ Class name: noun (kata benda)
*/
