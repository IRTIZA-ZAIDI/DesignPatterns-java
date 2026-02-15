# DesignPatterns

A compact Java project containing working, minimal examples of common **object-oriented design patterns**. Each pattern lives in its own package under `src/` and focuses on clarity over framework overhead.

This repo is useful as:

* exam/interview preparation material
* a quick reference for “what code for this pattern typically looks like”
* a starter template for adding more patterns or variations

---

## Patterns included

Source packages under `src/`:

* **Abstract Factory** (`src/AbstractFactory`)

  * Interfaces for `Button` / `Checkbox`, concrete Windows implementations, and a factory that creates platform-specific UI components.

* **Adapter** (`src/Adapter`)

  * Unifies different payment providers behind a `PaymentGateway` interface using an adapter.

* **Builder** (`src/Builder`)

  * Builds a `Meal` by composing `Item` implementations (e.g., `ChickenBurger`) with packing abstractions.

* **Decorator** (`src/Decorator`)

  * Adds toppings to a `Pizza` via a `ToppingDecorator` without modifying the base `SimplePizza`.

* **Factory** (`src/Factory`)

  * Creates different `Vehicle` types via `VehicleFactory` and `VehicleType`.

* **Mediator** (`src/Mediator`)

  * Components communicate through a `Mediator` rather than directly (e.g., `Button`, `Fan`, `PowerSupplier`).

* **Observer** (`src/Observer`)

  * A `Subject` notifies `Observer` implementations (e.g., `BinaryObserver`) on state changes.

* **Singleton** (`src/Singleton`)

  * A classic `Singleton` implementation.

---

## Project structure

```
DesignPatterns-main/
  src/
    AbstractFactory/
    Adapter/
    Builder/
    Decorator/
    Factory/
    Mediator/
    Observer/
    Singleton/
    Main.java
  out/                      # compiled output (IDE-generated; not required)
  FinalPrep.iml             # IntelliJ project file
```

---

## Requirements

* Java JDK 8+ (recommended: 11+)
* Works well with IntelliJ IDEA, but can be run from the command line.

---

## Run from the command line

### 1) Compile everything

From the repo root:

```bash
mkdir -p build
javac -d build $(find src -name "*.java")
```

This compiles all Java sources into `build/`.

### 2) Run a demo

Some packages include a `main` method you can run directly.

#### Factory demo

```bash
java -cp build Factory.Client
```

#### Builder demo

```bash
java -cp build Builder.MealBuilder
```

#### Root `Main`

```bash
java -cp build Main
```

Notes:

* If you add `main` methods to other packages (recommended), you can run them the same way:

  * `java -cp build <package>.<ClassName>`

---

## Run in IntelliJ IDEA

1. Open the project folder in IntelliJ.
2. Ensure the Project SDK is set (File → Project Structure → Project SDK).
3. Navigate to a demo class with `public static void main(String[] args)` (e.g., `Factory/Client.java`).
4. Click the green run icon.

---

## Adding a new pattern

1. Create a new package under `src/`, e.g. `src/Strategy`.
2. Add:

   * interfaces (abstractions)
   * concrete implementations
   * a small client/demo class with a `main` method
3. Recompile and run:

```bash
javac -d build $(find src -name "*.java")
java -cp build Strategy.Demo
```

---

## Notes

* The `out/` folder appears to contain IDE-compiled artifacts; it is not required to compile/run from the CLI.
* `Main.java` is currently a minimal placeholder (“Hello world!”). The pattern demos are best explored by running the per-pattern client/demo classes.

 file.
