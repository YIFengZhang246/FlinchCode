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
From the use of key controlled Finch to a more randomized game like Finch with a bucket  attached for throwing of printed coins.
---

### Code to Highlight
```java
            switch (option) {
                case 1:
                    String direction;
                    int distance;
                    int speed;

                    while (true) {
                        System.out.print("Enter direction (F/B): ");
                        direction = scanner.nextLine().trim().toUpperCase();
                        if (direction.equals("F") || direction.equals("B")) {
                            break;
                        }

// This was a life saver since I didn't need to problem solve to switch cases. 
```

---

- What was your motivation?

At first I wanted to design a robot who will go towards the direction based on the input I decide on. Yet I to redirect my focus on a more game like approach which would be better for what I printed. Which was a bucket with coins that could be thrown in towards a robot that would run towards random directions. Thus concluded with a system that can technically go towards random directions, however. So far it can only go North which would be like a GPS.

- What problem does it solve?

Currently with what the code does since I haven't randomized the direction the Finch would go towards. It should act as a GPS to run towards North. 

- What did you learn?

From this project, I learn how to control a robot using options (shown in the cases in my code). It taught me how to design and interact with objects using methods and classes, which is important in object-oriented programming. Through this i learned more about sensors like distance and motion. Overall, it’s a great introduction to programming logic, robotics behavior, and real time system responses.

