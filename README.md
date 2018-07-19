# crispy-tools
### Base
This class was made by @Andreas on StackOverflow

Base is an extremely useful class. It allows you to create a base with custom symbols.

Base ten is already implemented in the class (`Base.TEN`).

A base is created with the constructor `new Base(String symbols)`.

### Ripper
Easy reading from console. Really just wrapped `new BufferedReader(new InputStreamReader(System.in));`

You can use `readLine()` like normal but `readStyle()` is also useful.

### TextList
Easy text list with options. Pretty straightforward: `new TextList()` then `add(i, "txt")` then finally `display()` or `ask()`.
