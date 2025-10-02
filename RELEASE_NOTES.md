# JFLAP-NG 8.0-beta2 Release Notes

## Overview
JFLAP (Java Formal Languages and Automata Package) version 8.0-beta2 is a major release that includes Java 25 support, modernized codebase, and significant improvements to the build system and overall code quality. This release focuses on modernizing the codebase to leverage Java 25 features while maintaining full backward compatibility.

## New Features & Improvements

### Java 25 Support
- **Java 25 Compatibility**: Full support for Java 25 language features
- **Modern Code Patterns**: Updated codebase to use Java 25 idioms and best practices
- **Enhanced Performance**: Leverages Java 25 performance improvements
- **Code Modernization**: Replaced legacy iterator patterns with enhanced for-loops
- **Type Safety**: Eliminated unnecessary explicit casting and improved generics usage
- **Lambda Expressions**: Replaced anonymous inner classes with modern lambda syntax

### Build System
- **Gradle Build System**: Migrated from legacy build system to modern Gradle
- **Dependency Management**: Updated to use modern Batik SVG libraries (1.17)
- **Java 25 Support**: Updated to target Java 25 for latest features and performance

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
- Source compatibility: Java 25
- Target compatibility: Java 25
- Main class: `gui.Main`
- Resource directories properly preserved in build output

## System Requirements
- **Java**: Version 25 or later
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

