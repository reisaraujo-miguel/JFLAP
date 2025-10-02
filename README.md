# JFLAP NG - Community-Maintained Fork

[![CI/CD Pipeline](https://github.com/reisaraujo-miguel/jflap-ng/actions/workflows/ci-cd.yml/badge.svg)](https://github.com/reisaraujo-miguel/jflap-ng/actions/workflows/ci-cd.yml)
[![License](https://img.shields.io/badge/License-JFLAP-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-25-orange.svg)](https://openjdk.org/projects/jdk/25/)
[![Gradle](https://img.shields.io/badge/Gradle-9.1.0-green.svg)](https://gradle.org/)
[![Community Fork](https://img.shields.io/badge/Community-Fork-yellow.svg)](CONTRIBUTORS.md)

**JFLAP NG** (Next Generation) is a community-maintained fork of the original JFLAP (Java Formal Languages and Automata Package), originally developed at Duke University. This fork provides modern build infrastructure, updated dependencies, and improved development workflows while maintaining compatibility with the original JFLAP functionality.

> **⚠️ Important Note**: This is a community-maintained fork, not the official Duke University version. The original JFLAP was developed at Duke University by Professor Susan Rodger and her students. This fork maintains the original educational purpose while providing modern development tooling.

## Key Differences from Original JFLAP

- **Modern Build System**: Gradle-based build instead of legacy build system
- **Java 25 Compatibility**: Updated for modern Java versions with full Java 25 support
- **CI/CD Pipeline**: Automated testing and releases via GitHub Actions
- **Updated Dependencies**: Modern Batik SVG libraries and testing frameworks
- **Community Development**: Open to community contributions and improvements

## Features

- **Finite Automata**: Create and test deterministic and non-deterministic finite automata
- **Pushdown Automata**: Work with context-free languages using PDAs
- **Turing Machines**: Simulate single-tape and multi-tape Turing machines
- **Grammars**: Create and test context-free grammars
- **Regular Expressions**: Convert between regular expressions and finite automata
- **L-Systems**: Generate and visualize Lindenmayer systems
- **Pumping Lemmas**: Test languages against pumping lemma properties

## Quick Start

### Prerequisites

- **Java 25** or later
- **Gradle** (included via wrapper)

### Running JFLAP

#### Using Gradle Wrapper (Recommended)
```bash
./gradlew run
```

#### Building from Source
```bash
./gradlew clean build
```

#### Creating Distribution JAR
```bash
./gradlew fatJar
# The JAR will be created at: build/libs/JFLAP_Fat-fat.jar
```

#### Running Tests
```bash
./gradlew test
```

### System Requirements

- **Operating System**: Windows, macOS, Linux
- **Java**: Version 25 or later
- **Memory**: Minimum 512MB RAM recommended
- **Display**: 1024x768 resolution or higher

## Project Structure

```
jflap-ng/
├── automata/          # Core automata classes and implementations
├── grammar/           # Grammar-related classes and converters
├── gui/               # Graphical user interface components
├── regular/           # Regular expression processing
├── pumping/           # Pumping lemma implementations
├── file/              # File I/O and codec implementations
├── ICON/              # Application icons and images
├── MEDIA/             # Media resources and about images
├── DOCS/              # Documentation and help files
├── META-INF/          # Metadata and manifest files
├── src/test/java/     # Unit tests
└── build.gradle       # Build configuration
```

## Dependencies

### Core Dependencies
- **Batik SVG Library 1.17**: For SVG rendering and manipulation
  - `batik-svggen`, `batik-swing`, `batik-transcoder`
  - `batik-dom`, `batik-bridge`, `batik-util`

### Testing Dependencies
- **JUnit 4.13.2**: For unit testing

### Build System
- **Gradle 9.1.0**: Modern build automation
- **Java 25**: Source and target compatibility

## Development

### Building from Source

1. **Clone the repository**
   ```bash
   git clone https://github.com/reisaraujo-miguel/jflap-ng.git
   cd jflap
   ```

2. **Build the project**
   ```bash
   ./gradlew clean build
   ```

3. **Run the application**
   ```bash
   ./gradlew run
   ```

### IDE Setup

#### IntelliJ IDEA
1. Open the project directory
2. Import as Gradle project
3. Ensure JDK 25 is configured

#### Eclipse
1. Import as Gradle project
2. Configure Java 25 as the execution environment

## Contributing

We welcome contributions! Please see our [Contributing Guidelines](CONTRIBUTING.md) for details on how to get involved.

- Report bugs and request features via [GitHub Issues](https://github.com/reisaraujo-miguel/jflap-ng/issues)
- Submit pull requests for bug fixes and new features
- Join the discussion on improving JFLAP

## License

JFLAP is distributed under the JFLAP License. See the [LICENSE](LICENSE) file for details.

**Summary**: The license text must be included in any distribution of JFLAP. Any distribution of JFLAP or any work that includes it modified or unmodified must be available free of charge.

## Support

- **Documentation**: Check the `DOCS/` directory for user guides and tutorials
- **Issues**: Report problems via [GitHub Issues](https://github.com/reisaraujo-miguel/jflap-ng/issues)
- **Email**: jflap@cs.duke.edu (original development team)

## Acknowledgments

JFLAP was originally developed at Duke University by Susan Rodger and her students. See [CONTRIBUTORS.md](CONTRIBUTORS.md) for a complete list of contributors.

## Migration from Original JFLAP

If you're migrating from the original JFLAP to this community-maintained version:

### For Users
- **File Compatibility**: All JFLAP file formats (.jff, .jflap) are fully compatible
- **Java Requirement**: Requires Java 25 or later (original may work with older Java)
- **Flatpak**: A new Flatpak package will be available as `jflap-ng`

### For Developers
- **Build System**: Uses Gradle instead of legacy build tools
- **Dependencies**: Updated to modern library versions
- **Testing**: Comprehensive unit test suite included
- **CI/CD**: Automated builds and releases via GitHub Actions

## Version History

### JFLAP NG (Community Fork)
- **8.0-beta2** (Current): Java 25 support, modernized codebase, enhanced for-loops, lambda expressions
- **8.0-beta1**: Modernized build system, Java 21 support, CI/CD pipeline

### Original JFLAP (Duke University)
- **7.1**: Previous stable release with legacy build system
- **Earlier versions**: Various improvements and feature additions

---

*JFLAP NG - Community-maintained continuation of the educational tool for formal languages and automata theory*

*Original JFLAP developed at Duke University (2002-2009)*

