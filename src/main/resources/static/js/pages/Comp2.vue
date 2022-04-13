<template>
  <div>
    <h1>
      {{number}}
    </h1>
    <button class = "cl" v-for="element in elements">
      <h4>
        {{element.title}}
      </h4>

    </button>

  </div>
</template>

<script>

export default {
  name: "Th2",
  props:{
    elements:{
      type: Array,
      required: true
    }
  },
  data(){
    return{
      number:42342
    }
  }

}


</script>


<style></style>