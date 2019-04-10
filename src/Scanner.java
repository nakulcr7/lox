import java.util.List;

class Scanner {
  private final String source;
  private final List<Token> = new ArrayList<>();
  // first char in the lexeme being scanned.
  private int start = 0;
  // character in the lexeme that is currently being considered.
  private int current = 0;
  // tracks the line number of the token being scanned.
  private int line = 1;

  Scanner(String source) {
    this.source = source;
  }

  List<Token> scanTokens() {
    while (!isAtEnd()) {
      // We are at the beginning of the next lexeme.
      start = current;
      scanToken();
    }

    tokens.add(new Token(EOF, "", null, line));
    return tokens;
  }

  private boolean isAtEnd() {
    return current >= source.length();
  }
}
