# Lesson 3 Introduction to html

The notes for this lesson are in the form of HTML and CSS

There are 3 forms of css, inline, Page level, and External

``` html
<!-- External Css -->

<link rel="stylesheet" href="styles.css">

<!-- Page level  -->

<style>

p {
color: blue;
}

</style>

<!-- Inline -->

<p style="color: blue;">Text</p>>
```

## Attribute selectors

Some example of attribute selectors, there are many not listed below

```css
/*
The [attribute] selector is used to select elements with a specified attribute.
*/
a[target] {
  background-color: yellow;
}

/*
The [attribute="value"] selector is used to select elements with a specified attribute and value.
*/
a[target="_blank"] {
  background-color: yellow;
}

/*
The [attribute~="value"] selector is used to select elements with an attribute value containing a specified word.
*/
[title~="flower"] {
  border: 5px solid yellow;
}

/*
The [attribute|="value"] selector is used to select elements with the specified attribute, whose value can be exactly the specified value, or the specified value followed by a hyphen (-).
*/
[class|="top"] {
  background: yellow;
}

/*
The [attribute^="value"] selector is used to select elements with the specified attribute, whose value starts with the specified value.
*/
[class^="top"] {
  background: yellow;
}
```
