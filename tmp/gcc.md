Install gcc and clang, I think they come with xcode

```bash
xcode-select --install

g++ --version
clang --version
```

Install homebrew, the best package manager on any operating system

```bash
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

If you don't already have git you can download it with this, this is a good test to see if things are working correctly

```bash
brew install git
```

If g++ --version shows that you don't have g++ then
```bash
brew install gcc
```

Copy the below into a file called **main.cpp**

```cpp
int main() {
    std::cout << "Hello World!" << endl;
}
```

In the same **directory** as that file run the below command

```bash
g++ main.cpp

# after it compiles 

./a.out
```

### For Multi file cpp projects

We must install make

```bash
brew install make
```

To test if make is working run these commands, **MUST HAVE GIT**

```bash
git clone https://github.com/BrendanGlancy/CISS456.git

cd CISS456 

make

./pdr_app
```

<footer>
    Email me bglance68@gmail.com with any questions
</footer>
