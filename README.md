### Packed glyph font renderer

High performance and low v-ram cost font renderer batch method with async font initialization support.

Packed glyph page is a new way to store the characters needed. And you can control the number of characters loaded each time.

With the support of sparse texture, only one shader bind, one texture bind and one drawcall are required to complete the text drawing.

Even without the support of sparse texture, use the built-in multidraw or sequence batch methods to quickly draw when pages >= 2.

License: MIT
