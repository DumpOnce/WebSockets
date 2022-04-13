<template>
  <div>
    <Th></Th>
    <h1>
      {{element}}
    </h1>
    <Th2 :elements="elements"></Th2>
  </div>
</template>


<script>
import Th from './Comp1.vue';
import Th2 from './Comp2.vue';

export default {
  components:{
    Th,
    Th2
  },

  data(){
    return {
      element:321,
      elements:[
        {id:1,title:"frrg"},
        {id:2,title:"frvdfbdfrg"}
      ]
    }
  }
}


</script>


<style></style>