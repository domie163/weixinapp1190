<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">学号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xuehao" v-model="ruleForm.xuehao" placeholder="学号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">密码</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" placeholder="密码"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">学生姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">性别</view>
				<picker @change="xingbieChange" :value="xingbieIndex" :range="xingbieOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">学院</view>
				<picker @change="xueyuanChange" :value="xueyuanIndex" :range="xueyuanOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xueyuan?ruleForm.xueyuan:"请选择学院"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">专业</view>
				<picker @change="zhuanyeChange" :value="zhuanyeIndex" :range="zhuanyeOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhuanye?ruleForm.zhuanye:"请选择专业"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">班级</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.banji" v-model="ruleForm.banji" placeholder="班级"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">手机号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.shoujihao" v-model="ruleForm.shoujihao" placeholder="手机号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 20rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="zhaopianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">照片</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.zhaopian" :src="ruleForm.zhaopian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">教师工号</view>
				<picker @change="jiaoshigonghaoChange" :value="jiaoshigonghaoIndex" :range="jiaoshigonghaoOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{jiaoshigonghaoOptions[jiaoshigonghaoIndex]}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
									
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																																	
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												xuehao: '',
																mima: '',
																xueshengxingming: '',
																xingbie: '',
																xueyuan: '',
																zhuanye: '',
																banji: '',
																shoujihao: '',
																zhaopian: '',
																jiaoshigonghao: '',
																jiaoshixingming: '',
												},
																																				xingbieOptions: [],
				xingbieIndex: 0,
																xueyuanOptions: [],
				xueyuanIndex: 0,
																zhuanyeOptions: [],
				zhuanyeIndex: 0,
																																								jiaoshigonghaoOptions: [],
				jiaoshigonghaoIndex: 0,
																				// 登陆用户信息
				user: {},
                                ro:{
                                   xuehao : false,
                                   mima : false,
                                   xueshengxingming : false,
                                   xingbie : false,
                                   xueyuan : false,
                                   zhuanye : false,
                                   banji : false,
                                   shoujihao : false,
                                   zhaopian : false,
                                   jiaoshigonghao : false,
                                   jiaoshixingming : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																																								
																														// 自定义下拉框值
			this.xingbieOptions = "男,女".split(',')
												// 下拉框
			res = await this.$api.option(`xueyuanxinxi`,`xueyuan`,{});
			this.xueyuanOptions = res.data;
												// 下拉框
			res = await this.$api.option(`zhuanyexinxi`,`zhuanye`,{});
			this.zhuanyeOptions = res.data;
																														// 下2
			res = await this.$api.option(`jiaoshi`,`jiaoshigonghao`,{});
			this.jiaoshigonghaoOptions = res.data;
															
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`xuesheng`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='xuehao'){
					this.ruleForm.xuehao = obj[o];
					this.ro.xuehao = true;
					continue;
					}
					if(o=='mima'){
					this.ruleForm.mima = obj[o];
					this.ro.mima = true;
					continue;
					}
					if(o=='xueshengxingming'){
					this.ruleForm.xueshengxingming = obj[o];
					this.ro.xueshengxingming = true;
					continue;
					}
					if(o=='xingbie'){
					this.ruleForm.xingbie = obj[o];
					this.ro.xingbie = true;
					continue;
					}
					if(o=='xueyuan'){
					this.ruleForm.xueyuan = obj[o];
					this.ro.xueyuan = true;
					continue;
					}
					if(o=='zhuanye'){
					this.ruleForm.zhuanye = obj[o];
					this.ro.zhuanye = true;
					continue;
					}
					if(o=='banji'){
					this.ruleForm.banji = obj[o];
					this.ro.banji = true;
					continue;
					}
					if(o=='shoujihao'){
					this.ruleForm.shoujihao = obj[o];
					this.ro.shoujihao = true;
					continue;
					}
					if(o=='zhaopian'){
					this.ruleForm.zhaopian = obj[o];
					this.ro.zhaopian = true;
					continue;
					}
					if(o=='jiaoshigonghao'){
					this.ruleForm.jiaoshigonghao = obj[o];
					this.ro.jiaoshigonghao = true;
					continue;
					}
					if(o=='jiaoshixingming'){
					this.ruleForm.jiaoshixingming = obj[o];
					this.ro.jiaoshixingming = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																		// 下二随
			async jiaoshigonghaoChange (e) {
				this.jiaoshigonghaoIndex = e.target.value
				this.ruleForm.jiaoshigonghao = this.jiaoshigonghaoOptions[this.jiaoshigonghaoIndex]
				let res = await this.$api.follow(`jiaoshi`, `jiaoshigonghao`,{
					columnValue: this.ruleForm.jiaoshigonghao
				});
																																																																																												if(res.data.jiaoshixingming){
					this.ruleForm.jiaoshixingming = res.data.jiaoshixingming
				}
											},
												
			// 多级联动参数
																																																																								
																																																																					
																																																																					
																											// 下拉变化
			xingbieChange(e) {
				this.xingbieIndex = e.target.value
				this.ruleForm.xingbie = this.xingbieOptions[this.xingbieIndex]
			},
												// 下拉变化
			xueyuanChange(e) {
				this.xueyuanIndex = e.target.value
				this.ruleForm.xueyuan = this.xueyuanOptions[this.xueyuanIndex]
			},
												// 下拉变化
			zhuanyeChange(e) {
				this.zhuanyeIndex = e.target.value
				this.ruleForm.zhuanye = this.zhuanyeOptions[this.zhuanyeIndex]
			},
																																				
																																																																																	zhaopianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zhaopian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																											
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																								if((!this.ruleForm.xuehao)){
					this.$utils.msg(`学号不能为空`);
					return
				}
																																																																								if((!this.ruleForm.xueshengxingming)){
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
																																																																																																																																																																																																																																																																																																				if(this.ruleForm.id){
					await this.$api.update(`xuesheng`, this.ruleForm);
				}else{
					await this.$api.add(`xuesheng`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
