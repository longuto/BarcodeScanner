package cn.hugo.android.scanner;

import cn.hugo.android.scanner.utils.EncodingUtils;
import cn.hugo.android.scanner.utils.UIUtils;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class EncodeQrActivity extends Activity {
	
	private Bitmap mLogoBtm;	// login图标
	private ImageView mQrIv;	// 二维码图片控件
	public static String CONTENT = "安徽辛普信息科技有限公司";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_encode_qr);
		
		mLogoBtm = BitmapFactory.decodeResource(getResources(), R.drawable.logo_anhuixinpu);
		mQrIv = (ImageView) findViewById(R.id.iv_encode);
		
		Bitmap qrCode = EncodingUtils.createQRCode(CONTENT, UIUtils.dip2px(200), mLogoBtm);
		mQrIv.setImageBitmap(qrCode);
	}

}
