# Contributing to JFLAP-NG

Thank you for your interest in contributing to JFLAP! We welcome contributions from everyone who wants to help improve this educational tool for formal languages and automata theory.

## Table of Contents

- [Code of Conduct](#code-of-conduct)
- [Getting Started](#getting-started)
- [Development Workflow](#development-workflow)
- [Pull Request Process](#pull-request-process)
- [Bug Reports](#bug-reports)
- [Feature Requests](#feature-requests)
- [Development Guidelines](#development-guidelines)
- [Testing](#testing)
- [Documentation](#documentation)

## Code of Conduct

Please read and follow our [Code of Conduct](CODE_OF_CONDUCT.md) to help us maintain a respectful and inclusive community.

## Getting Started

### Prerequisites

- **Java 21** or later
- **Git** for version control
- **Gradle** (included via wrapper)

### Setting Up the Development Environment

1. **Fork the repository** on GitHub
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/your-username/jflap.git
   cd jflap
   ```

3. **Add the upstream repository** (optional but recommended):
   ```bash
   git remote add upstream https://github.com/reisaraujo-miguel/jflap.git
   ```

4. **Build the project** to ensure everything works:
   ```bash
   ./gradlew clean build
   ```

5. **Run the application** to verify setup:
   ```bash
   ./gradlew run
   ```

## Development Workflow

### Branch Strategy

- `main` - Stable production code
- `develop` - Development branch for upcoming features
- `feature/*` - Feature branches
- `bugfix/*` - Bug fix branches
- `hotfix/*` - Urgent production fixes

### Creating a Feature Branch

```bash
git checkout -b feature/your-feature-name develop
```

### Keeping Your Fork Updated

```bash
git fetch upstream
git checkout develop
git merge upstream/develop
```

## Pull Request Process

1. **Create a feature branch** from `develop`
2. **Make your changes** following our coding standards
3. **Write or update tests** for your changes
4. **Run all tests** to ensure nothing is broken
5. **Update documentation** if needed
6. **Submit a pull request** to the `develop` branch

### Pull Request Guidelines

- **Clear title** describing the change
- **Detailed description** of what was changed and why
- **Reference related issues** using GitHub keywords (e.g., "Fixes #123")
- **Screenshots** for UI changes
- **Test results** showing all tests pass

## Bug Reports

When reporting bugs, please include:

- **Clear description** of the problem
- **Steps to reproduce** the issue
- **Expected behavior** vs actual behavior
- **Environment details** (OS, Java version, etc.)
- **Error messages** or screenshots if applicable

### Bug Report Template

```markdown
## Description
[Clear description of the bug]

## Steps to Reproduce
1. [First step]
2. [Second step]
3. [Etc.]

## Expected Behavior
[What should happen]

## Actual Behavior
[What actually happens]

## Environment
- OS: [e.g., Windows 10, macOS 12, Ubuntu 22.04]
- Java Version: [e.g., Java 21.0.1]
- JFLAP Version: [e.g., 8.0]

## Additional Context
[Any other relevant information]
```

## Feature Requests

For feature requests, please provide:

- **Clear description** of the proposed feature
- **Use case** explaining why this feature would be useful
- **Potential implementation** ideas (optional)
- **Related features** or similar functionality in other tools

## Development Guidelines

### Code Style

- Follow Java naming conventions
- Use meaningful variable and method names
- Write clear, concise comments for complex logic
- Keep methods focused and single-purpose
- Use proper indentation (4 spaces)

### Architecture Guidelines

- Maintain separation between GUI and business logic
- Follow existing patterns in the codebase
- Keep automata implementations independent
- Use interfaces for extensible components

### Commit Messages

Use conventional commit format:

```
type(scope): description

[optional body]

[optional footer]
```

Types:
- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting, etc.)
- `refactor`: Code refactoring
- `test`: Adding or updating tests
- `chore`: Maintenance tasks

Example:
```
feat(automata): add support for epsilon transitions in NFA

- Implement epsilon closure computation
- Update NFA simulation to handle epsilon moves
- Add unit tests for epsilon transitions

Fixes #123
```

## Testing

### Running Tests

```bash
# Run all tests
./gradlew test

# Run specific test class
./gradlew test --tests "automata.AutomatonTest"

# Run with test coverage
./gradlew test jacocoTestReport
```

### Writing Tests

- Write unit tests for new functionality
- Test edge cases and error conditions
- Use descriptive test method names
- Follow the Arrange-Act-Assert pattern
- Mock external dependencies when appropriate

### Test Coverage

- Aim for high test coverage for core functionality
- Focus on testing business logic rather than UI
- Include integration tests for critical workflows

## Documentation

### Code Documentation

- Document public APIs with Javadoc
- Explain complex algorithms with comments
- Keep documentation up to date with code changes

### User Documentation

- Update user guides in `DOCS/` directory when adding features
- Include screenshots for UI changes
- Document any new file formats or protocols

## Building and Packaging

### Creating a Release Build

```bash
# Build fat JAR with all dependencies
./gradlew clean fatJar

# The JAR will be created at: build/libs/JFLAP_Fat-fat.jar
```

### Local Testing

Test the built JAR locally:

```bash
java -jar build/libs/JFLAP_Fat-fat.jar
```

## Getting Help

- **GitHub Issues**: For bug reports and feature requests
- **Documentation**: Check the `DOCS/` directory
- **Code Review**: Ask questions in pull request comments
- **Community**: Reach out to other contributors

## Recognition

All contributors will be acknowledged in our [CONTRIBUTORS.md](CONTRIBUTORS.md) file. Significant contributions may also be mentioned in release notes.

Thank you for contributing to JFLAP and helping make formal languages education more accessible!

---

*This contributing guide is adapted from best practices in open source development.*

