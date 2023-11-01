# Vue in 100 seconds

VueJS is an open progressive JavaScript framework used to develop interative web interfaces.

## What is Vue?

Vue is a JavaScript framework for building user interfaces. It builds on top of standard HTML, CSS and JavaScript, and provides a declarative and component-based programming model that helps you effciently develop user interfaces, be it simple or complex.

Example

```JavaScript
import { createApp } from 'vue'

createApp({
  data() {
    return {
      count: 0
    }
  }
}.mount('#app')
```

```html
<div id="app">
  <button @click="count++">
    Count is: {{ count }}
  </button>
</div>
```

The above resutlts in a counter app button

# Vue past the 100 seconds
