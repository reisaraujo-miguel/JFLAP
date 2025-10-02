# JFLAP 8.0 Release Notes

## Overview
JFLAP (Java Formal Languages and Automata Package) version 8.0 is a major release that includes significant improvements to the build system, testing infrastructure, and overall code quality.

## New Features & Improvements

### Build System
- **Gradle Build System**: Migrated from legacy build system to modern Gradle
- **Dependency Management**: Updated to use modern Batik SVG libraries (1.17)
- **Java 21 Support**: Updated to target Java 21 for better performance and features

### Testing Infrastructure
- **Unit Testing**: Comprehensive unit tests for core functionality
  - Automaton operations (state/transition management)
  - Resource loading
  - Grammar operations
  - Regular expression validation
- **CI/CD Pipeline**: GitHub Actions workflow for automated testing and releases

### Code Quality
- **Resource Loading**: Fixed icon loading issues in Gradle runtime environment
- **Clean Codebase**: Removed unused IDE files and temporary cache files
- **Modern Dependencies**: Removed deprecated dependencies (rhino, xerces, xml-apis)

### User Interface
- **Icon Loading**: Fixed issue where icons wouldn't load when running with `gradle run`
- **About Box**: Updated version display to 8.0

## Technical Changes

### Dependencies Updated
- Added: `org.apache.xmlgraphics:batik-*:1.17` (modern SVG support)
- Removed: `rhino-1.7.7.jar`, `fop-transcoder-allinone-2.9.jar`
- Removed: `xml-apis-1.4.01.jar`, `xml-apis-ext-1.3.04.jar`
- Removed: `xerces:xercesImpl` (replaced by Java built-in XML processing)

### Build Configuration
- Source compatibility: Java 21
- Target compatibility: Java 21
- Main class: `gui.Main`
- Resource directories properly preserved in build output

## System Requirements
- **Java**: Version 21 or later
- **Operating System**: Windows, macOS, Linux

## Getting Started

### Running with Gradle
```bash
./gradlew run
```

### Building from Source
```bash
./gradlew build
```

### Running Tests
```bash
./gradlew test
```

### Creating Distribution JAR
```bash
./gradlew fatJar
```

## Known Issues
- None reported in this release

## Migration Notes
This release maintains backward compatibility with JFLAP 7.1 file formats. All existing automata, grammars, and other JFLAP documents should work without modification.

## Contributors
- Original JFLAP development team
- Community contributors for bug fixes and improvements

---
*JFLAP is open source software. Please see the LICENSE file for terms.*

