<template>
  <div class="hello">
     <ve-map :data="chartData"></ve-map>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      chartData: {
        columns: ['位置', '税收', '人口', '面积'],
        rows: [
          { '位置': '吉林', '税收': 123, '人口': 123, '面积': 92134 },
          { '位置': '北京', '税收': 1223, '人口': 2123, '面积': 29234 },
          { '位置': '上海', '税收': 2123, '人口': 1243, '面积': 94234 },
          { '位置': '浙江', '税收': 4123, '人口': 5123, '面积': 29234 }
        ]
      }
    }
  }
}
</script>

<style scoped>

</style>
