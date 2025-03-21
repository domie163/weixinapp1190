<template>
	<view class="content">
		<view class="logo" v-if="false">
			<image :style='{"boxShadow":"0 0 16rpx #59f43e","borderColor":"#ccc","borderRadius":"40rpx","borderWidth":"2rpx","width":"160rpx","borderStyle":"solid","url":"http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg","isShow":false,"height":"160rpx"}' src='http://codegen.caihongy.cn/20201024/ed5e326ca66f403aa3197b5fbb4ec733.jpg' mode="aspectFill"></image>
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xuehao" type="text" class="uni-input" name="" placeholder="学号" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.xueshengxingming" type="text" class="uni-input" name="" placeholder="学生姓名" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
                                <view :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengxueyuanChange" :value="xueshengxueyuanIndex" :range="xueshengxueyuanOptions">
                                <view :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xueyuan?ruleForm.xueyuan:"请选择学院"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
                        <picker @change="xueshengzhuanyeChange" :value="xueshengzhuanyeIndex" :range="xueshengzhuanyeOptions">
                                <view :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhuanye?ruleForm.zhuanye:"请选择专业"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.banji" type="text" class="uni-input" name="" placeholder="班级" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.shoujihao" type="text" class="uni-input" name="" placeholder="手机号" />
		</view>
		<view v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiaoshixingming" type="text" class="uni-input" name="" placeholder="教师姓名" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiaoshigonghao" type="text" class="uni-input" name="" placeholder="教师工号" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima" type="text" class="uni-input" name="" placeholder="密码" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiaoshixingming" type="text" class="uni-input" name="" placeholder="教师姓名" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
                        <picker @change="jiaoshixingbieChange" :value="jiaoshixingbieIndex" :range="jiaoshixingbieOptions">
                                <view :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
                        <picker @change="jiaoshizhichengChange" :value="jiaoshizhichengIndex" :range="jiaoshizhichengOptions">
                                <view :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.zhicheng?ruleForm.zhicheng:"请选择职称"}}</view>
                        </picker>
                </view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.lianxidianhua" type="text" class="uni-input" name="" placeholder="联系电话" />
		</view>
		<view v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
			<input :style='{"borderColor":"rgba(51, 153, 153, 1)","backgroundColor":"#fff","borderRadius":"20rpx","color":"#333","textAlign":"left","borderWidth":"4rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.jiaoshiyouxiang" type="text" class="uni-input" name="" placeholder="教师邮箱" />
		</view>
		<view>
			<button @tap="register" type="primary" :style='{"borderColor":"#ccc","backgroundColor":"rgba(51, 153, 153, 1)","borderRadius":"20rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"2rpx","fontSize":"32rpx","borderStyle":"solid","height":"88rpx"}'>注册</button>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
                                xueshengxingbieOptions: [],
                                xueshengxingbieIndex: 0,
                                xueshengxueyuanOptions: [],
                                xueshengxueyuanIndex: 0,
                                xueshengzhuanyeOptions: [],
                                xueshengzhuanyeIndex: 0,
                                jiaoshixingbieOptions: [],
                                jiaoshixingbieIndex: 0,
                                jiaoshizhichengOptions: [],
                                jiaoshizhichengIndex: 0,
				ruleForm: {
				},
				tableName:""
			}
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
	    		this.tableName = table;

                        // 自定义下拉框值
			if(this.tableName=='xuesheng'){
                        	this.xueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.xueshengxingbieOptions[0]
			}
			if(this.tableName=='xuesheng'){
                        	res = await this.$api.option(`xueyuanxinxi`,`xueyuan`,{});
                        	this.xueshengxueyuanOptions = res.data;
				this.ruleForm.xueyuan=this.xueshengxueyuanOptions[0]
			}
			if(this.tableName=='xuesheng'){
                        	res = await this.$api.option(`zhuanyexinxi`,`zhuanye`,{});
                        	this.xueshengzhuanyeOptions = res.data;
				this.ruleForm.zhuanye=this.xueshengzhuanyeOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiaoshi'){
                        	this.jiaoshixingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.jiaoshixingbieOptions[0]
			}
                        // 自定义下拉框值
			if(this.tableName=='jiaoshi'){
                        	this.jiaoshizhichengOptions = "高级讲师,讲师,助教,教师,副教授".split(',');
				this.ruleForm.zhicheng=this.jiaoshizhichengOptions[0]
			}
			
			this.styleChange()
		},
		methods: {
                        // 下拉变化
                        xueshengxingbieChange(e) {
                                this.xueshengxingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
                        },
                        // 下拉变化
                        xueshengxueyuanChange(e) {
                                this.xueshengxueyuanIndex = e.target.value
                                this.ruleForm.xueyuan = this.xueshengxueyuanOptions[this.xueshengxueyuanIndex]
                        },
                        // 下拉变化
                        xueshengzhuanyeChange(e) {
                                this.xueshengzhuanyeIndex = e.target.value
                                this.ruleForm.zhuanye = this.xueshengzhuanyeOptions[this.xueshengzhuanyeIndex]
                        },
                        // 下拉变化
                        jiaoshixingbieChange(e) {
                                this.jiaoshixingbieIndex = e.target.value
                                this.ruleForm.xingbie = this.jiaoshixingbieOptions[this.jiaoshixingbieIndex]
                        },
                        // 下拉变化
                        jiaoshizhichengChange(e) {
                                this.jiaoshizhichengIndex = e.target.value
                                this.ruleForm.zhicheng = this.jiaoshizhichengOptions[this.jiaoshizhichengIndex]
                        },

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.uni-input .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.registerFrom.content.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				if((!this.ruleForm.xuehao) && `xuesheng` == this.tableName){
					this.$utils.msg(`学号不能为空`);
					return
				}
				if((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName){
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
					this.$utils.msg(`手机号应输入手机格式`);
					return
				}
				if((!this.ruleForm.jiaoshigonghao) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师工号不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师姓名不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.jiaoshiyouxiang&&(!this.$validate.isEmail(this.ruleForm.jiaoshiyouxiang))){
					this.$utils.msg(`教师邮箱应输入邮件格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	$color-primary: #b49950;

	.content {
		padding: 100upx;
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

	.logo {
		text-align: center;

		image {
			height: 200upx;
			width: 200upx;
			margin: 0 0 60upx;
		}
	}

	.uni-form-item {
		margin-bottom: 40upx;
		padding: 0;

		.uni-input {
			font-size: 30upx;
			padding: 7px 0;
		}
	}

	button[type="primary"] {
		background-color: $color-primary;
		border-radius: 0;
		font-size: 34upx;
		margin-top: 60upx;
	}

	.links {
		text-align: center;
		margin-top: 40upx;
		font-size: 26upx;
		color: #999;

		view {
			display: inline-block;
			vertical-align: top;
			margin: 0 10upx;
		}

		.link-highlight {
			color: $color-primary
		}
	}
.picker-select-input {
	line-height: 88rpx;
}

</style>
