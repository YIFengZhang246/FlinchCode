# FinchCode

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |             |
|    ✅️   | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I initially wanted to design a robot that would be able to move depending on the keys pr3ssed on the keyboard. However as it went on. I had used user input and decided to stick with it. Whenever the robot is about to hit something it would move towards another way. Thus far the code won't randomized which direction the Finch would go, and currently it will go towards north always. So basically it's just a Northward GPS for now.
</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Commentary

---

### Code to Highlight
```java
public static void followLine(Finch f) {
        int left = f.getLine("L");
        int right = f.getLine("R");

        System.out.println("left: " + left + " right: " + right);
        if (left < 90) {
                f.setMotors(0, 10);
        } else if (right > 90) {
                f.setMotors(10, 0);
        } else {
                f.setMotors(10, 10);
        }
        f.pause(.1);
}
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?