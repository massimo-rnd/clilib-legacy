<div align="center">
  <a href="https://github.com/druffko/clilib-legacy">
    <img width="200" height="200" src="https://i.imgur.com/E8JFbdP.png">
  </a>
  <br>

![GitHub release (latest by date including pre-releases)](https://img.shields.io/github/v/release/druffko/clilib-legacy?include_prereleases)

![Java Version](https://img.shields.io/badge/java-1.8-brightgreen)
![GitHub last commit](https://img.shields.io/github/last-commit/druffko/clilib-legacy)
![Java Version](https://img.shields.io/badge/build-passing-brightgreen)
![Java Version](https://img.shields.io/badge/PRs-welcome-brightgreen)

  <br>

  ![GitHub All Releases](https://img.shields.io/github/downloads/druffko/clilib-legacy/total)
  ![GitHub closed issues](https://img.shields.io/github/issues-closed/druffko/clilib-legacy)
  ![GitHub issues](https://img.shields.io/github/issues/druffko/clilib-legacy)
  
  <h1>clilib-legacy</h1>
  <p>
    clilib is a java(1.8) library providing different style additions for command line applications. This might sound pretty useless in the first place (probably because it is), but there might be some cases, where colors actually come in handy.
  </p>
</div>

---

## Table of Contents
- [About](#about)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

---

## About

clilib-legacy is a java library providing different style additions for command line applications. This might sound pretty useless in the first place (probably because it is), but there might be some cases, where colors actually come in handy.

---

## Features

- ✅ Colors for Text in your CLI-Application
- ✅ Textstyles for Text in your CLI-Application
- ✅ Wrapper-Methods for easy usage

---

## Installation

### Download the latest version

To start off, please head to the [releases page](https://github.com/druffko/clilib-legacy/releases) and download a pre-built jar.

*If you don't trust me for some reason, feel free to download the latest released source code and build it your self.*

### Import the library to your IDE/project

This process depends on the IDE, so just do it as it is done with your's.

---

## Usage

### Using colors
Colors can be used like this:

```java
System.out.println(TextColors.red + "Look at what I can do!" + TextColors.reset);
System.out.println(TextColors.bgred + "Look at what I can do!" + TextColors.reset);
```

### Using styles
Styles can be used like this:

```java
System.out.println(TextStyles.bold + "Look at what I can do!" + TextStyles.reset);
System.out.println(TextColors.underline + "Look at what I can do!" + TextColors.reset);
```

### Alternatively, you can use Clilib's wrapper methods:

Colors:

```java
System.out.println(Color.blue("Ciao!"));
```

Backgrounds:

```java
System.out.println(Background.red("Sain bainuu!"));
```

Formatting:

```java
System.out.println(Formatting.bold("Halo!"));
```

Lining:

```java
System.out.println(Lining.underline("Silaw!"));
```

This way, you can combine several stylings at once very easily:

```java
System.out.println(Background.green(Lining.underline(Color.blue("Ndêwó!"))));
System.out.println(Lining.strikethrough(Color.purple("Yassou!")));
```

---

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a new branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a pull request

---

## License

This project is licensed under the [MIT License](LICENSE).

---

## Contact

- **druffko** - [@druffko](https://twitter.com/druffko) - hi@druffko.gg
- **Project Link** - https://github.com/druffko/clilib-legacy

Feel free to reach out if you have any questions or suggestions!