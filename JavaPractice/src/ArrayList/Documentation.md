# ArrayList in Java – Complete Documentation

## 📌 Introduction

`ArrayList` is a **resizable array implementation** of the `List` interface in Java. It is part of the **Java Collections Framework** and is used to store **ordered**, **indexed**, and **duplicate** elements.

Unlike normal arrays, an `ArrayList` can **grow or shrink dynamically** during runtime.

---

## 📦 Package Information

```java
import java.util.ArrayList;
```

`ArrayList` belongs to the `java.util` package.

---

## 🧩 Hierarchy of ArrayList

```
Object
  └── AbstractCollection
        └── AbstractList
              └── ArrayList
```

It implements:

* `List`
* `RandomAccess`
* `Cloneable`
* `Serializable`

---

## ⚙️ Key Features of ArrayList

* Dynamic size (no fixed length)
* Allows **duplicate elements**
* Maintains **insertion order**
* Allows **null values**
* Provides **index-based access**
* Faster than `LinkedList` for searching

---

## ❌ Limitations of ArrayList

* Slower for insertion and deletion (compared to LinkedList)
* Not synchronized (not thread-safe by default)

---

## 🛠️ Creating an ArrayList

### 1️⃣ Without Generics

```java
ArrayList list = new ArrayList();
```

### 2️⃣ With Generics (Recommended)

```java
ArrayList<Integer> list = new ArrayList<>();
```

---

## ➕ Adding Elements

### add(element)

```java
list.add(10);
list.add(20);
```

### add(index, element)

```java
list.add(1, 15);
```

---

## 📥 Accessing Elements

### get(index)

```java
int value = list.get(0);
```

---

## ✏️ Updating Elements

### set(index, element)

```java
list.set(0, 100);
```

---

## ❌ Removing Elements

### remove(index)

```java
list.remove(1);
```

### remove(object)

```java
list.remove(Integer.valueOf(10));
```

---

## 🔍 Searching Elements

### contains(element)

```java
list.contains(20);
```

### indexOf(element)

```java
list.indexOf(20);
```

---

## 📏 Size of ArrayList

```java
list.size();
```

---

## 🔄 Iterating an ArrayList

### Using for-each loop

```java
for(int val : list){
    System.out.println(val);
}
```

### Using for loop

```java
for(int i = 0; i < list.size(); i++){
    System.out.println(list.get(i));
}
```

---

## 🧹 Clearing the ArrayList

```java
list.clear();
```

---

## 🔁 Sorting an ArrayList

```java
Collections.sort(list);
```

---

## 🧠 Array vs ArrayList

| Feature     | Array              | ArrayList       |
| ----------- | ------------------ | --------------- |
| Size        | Fixed              | Dynamic         |
| Type        | Primitive & Object | Object only     |
| Performance | Faster             | Slightly slower |
| Flexibility | Low                | High            |

---

## ⏱️ Time Complexity

| Operation | Time Complexity |
| --------- | --------------- |
| Add       | O(1)            |
| Remove    | O(n)            |
| Search    | O(n)            |
| Access    | O(1)            |

---

## 🔒 Thread Safety

`ArrayList` is **not thread-safe**.

To make it synchronized:

```java
List list = Collections.synchronizedList(new ArrayList());
```

---

## 📌 Real-Life Use Cases

* Storing student records
* Managing dynamic lists
* Handling search results
* Data collection in applications

---

## ✅ Advantages

* Easy to use
* Dynamic resizing
* Rich built-in methods

---

## ❗ Disadvantages

* Not suitable for frequent insertion/deletion
* Not thread-safe by default

---

## 🎯 Conclusion

`ArrayList` is one of the most **commonly used data structures** in Java. It is best used when **frequent access** and **less modification** of data is required.

---

## 📘 Exam Tip (BCA)

> Use `ArrayList` when size is unknown and fast access is required.

---

⭐ *Prepared for BCA & Java learners*
